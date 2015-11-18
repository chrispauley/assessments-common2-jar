package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.cfg.LoadingConfiguration;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.load.Dereferencing;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingMessage;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;

import junit.framework.TestCase;

public class ScoreTypeTest extends TestCase {
	static final String FILENAME = "ScoreType";
	final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/assessmentsCommon.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testScoreType_01() {

		try {
			String filename = FILE_PATH + FILENAME + "_01.json";
			ScoreType ai = new ScoreType();
			ai.setValidFrom("2015-11");
			ai.setValidTo("2015-12");
			ai.getScoreNumeric().add(this.createNumericScore());
			
			Serializer.marshalJSON(ai, System.out);
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

			this.testValidate(filename);

		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	public void testScoreType_02() {

		try {
			String filename = FILE_PATH + FILENAME + "_02.json";
			ScoreType ai = new ScoreType();
			ai.setValidFrom("2015-11");
			ai.setValidTo("2015-12");
			ai.getScoreText().add("This is the text score type");
			
			Serializer.marshalJSON(ai, System.out);
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

			this.testValidate(filename);

		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testScoreType_03() {

		try {
			String filename = FILE_PATH + FILENAME + "_03.json";
			ScoreType ai = new ScoreType();
			ai.setValidFrom("2015-11");
			ai.setValidTo("2015-12");
			ai.getScoreNumeric().add(this.createNumericScore());
			
			Serializer.marshalJSON(ai, System.out);
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

			this.testValidate(filename);

		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	private SpecifiedCompetencyType createSpecifiedCompencyType() {
		SpecifiedCompetencyType sc = new SpecifiedCompetencyType();
		sc.setCompetencyName("Competency Name");
		sc.setProficiencyLevel(createBaseScoreType());
		sc.getCompetencyIds().add(createIdentifierType("CID_001"));
		return sc;
	}

	private IdentifierType createBandIdentifierId(String value) {
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		return id;
	}

	private AssessmentScoreType createAssessmentScore() {
		AssessmentScoreType ast = new AssessmentScoreType();
		ast.setScore(createScoreType());
		ast.getAdditionalItem().add(createAdditionalItemType());
		ast.getComment().add("Comments are supported.");
		ast.getDescription().add("Descriptions are supported.");
		ast.setBandId(this.createIdentifierType("bandId_identifier."));
		ast.setScore(this.createScoreType());
		return ast;
	}

	private AssessmentScoreType createOverallAssessmentScore() {
		AssessmentScoreType ast = new AssessmentScoreType();
		ast.setPassedIndicator(true);
		return ast;
	}

	private ScoreType createScoreType() {
		ScoreType st = new ScoreType();
		st.getScoreNumeric().add(this.createNumericScore2());
		return st;
	}

	private ScoreNumericType createNumericScore() {
		ScoreNumericType sn = new ScoreNumericType();
		sn.setInterval(BigDecimal.valueOf(100));
		return sn;
	}

	private AdditionalItemType createAdditionalItemType() {
		AdditionalItemType ai = new AdditionalItemType();
		ai.setID("ThisIsTheID");
		ai.setName("AdditionalItemName");
		ai.setContent("The content of AdditionalItemType");
		ai.setSequence(BigInteger.valueOf(1));
		ai.getTypeCodes().add(createCodeType("TypeOne"));
		ai.getTypeCodes().add(createCodeType("TypeTwo"));
		return ai;
	}
	private CodeType createCodeType(String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		return ct;
	}

	private ScoreNumericType createNumericScore2() {
		ScoreNumericType sn = new ScoreNumericType();
		sn.setMaximumScoreNumeric(BigDecimal.valueOf(100));
		sn.setMinimumScoreNumeric(BigDecimal.valueOf(40));
		sn.setScoreNumericCode(BigDecimal.valueOf(80));
		return sn;
	}

	private IdentifierType createIdentifierType(String string) {
		IdentifierType id = new IdentifierType();
		id.setValue(string);
		return id;
	}

	private BaseScoreType createBaseScoreType() {
		BaseScoreType bst = new BaseScoreType();
		bst.getScoreText().add("base score type text");
		return bst;
	}


	public void testValidate(String instance) {

		System.out.println("\nValidating: " + instance + "\n\t"
				+ this.FILE_PATH_SCHEMA);
		try {
			JsonNode fstabSchema = JsonLoader.fromPath(FILE_PATH_SCHEMA);
			JsonNode json1 = JsonLoader.fromPath(instance);

			LoadingConfiguration cfg = LoadingConfiguration.newBuilder()
					.dereferencing(Dereferencing.CANONICAL).freeze();
			
			JsonSchemaFactory factory = JsonSchemaFactory.newBuilder()
					.setLoadingConfiguration(cfg).freeze();

			com.github.fge.jsonschema.main.JsonSchema schema = factory
					.getJsonSchema(fstabSchema);

			ProcessingReport report;

			report = schema.validate(json1);
			System.out.println(report);
			if (report != null) {
				Iterator<ProcessingMessage> iter = report.iterator();
				while (iter.hasNext()) {
					ProcessingMessage pm = iter.next();
					System.out.println("\nProcessing Message: " + pm.getMessage());
				}
			}

		} catch (IOException | ProcessingException e) {
			e.printStackTrace();
		}
	}
}
