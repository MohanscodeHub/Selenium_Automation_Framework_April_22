package com.clipboard.utils;


import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestUtils {

    private TestUtils() {
    }

    public static String getJsonFileAsString(String filepath) throws IOException {

        return new String(Files.readAllBytes(Paths.get(filepath)));


    }

    public static Boolean validateJsonSchema(String filepath,String responsejson)  {

        Boolean validateJsonSchema=false;

        try {

            JSONTokener schemaData = new JSONTokener(new FileInputStream(new File(filepath)));
            System.out.println(schemaData);
            JSONObject jsonSchema = new JSONObject(schemaData);
            Schema schema = SchemaLoader.load(jsonSchema);
            schema.validate(new JSONObject(responsejson));
            validateJsonSchema =true;

        } catch (FileNotFoundException e) {
            System.out.println("File  for jsonschema validation is not found "+ e);
        }

        return validateJsonSchema;


    }

}