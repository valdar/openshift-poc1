/*
 * Navitas Enquiry-to-Offer Value-Chain
 * This is a sample Enquiry-to-Offer-Value-Chain server.  You can find out more about Navitas at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.navitas.ospoc.enq2offer01.api;

import com.navitas.ospoc.enq2offer01.ApiException;
import java.io.File;
import com.navitas.ospoc.enq2offer01.model.GenericResponseMsg;
import com.navitas.ospoc.enq2offer01.model.Prospect;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ProspectApi
 */
@Ignore
public class ProspectApiTest {

    private final ProspectApi api = new ProspectApi();

    
    /**
     * Add a new Prospect
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProspectTest() throws ApiException {
        Prospect body = null;
        api.addProspect(body);

        // TODO: test validations
    }
    
    /**
     * Deletes a prospect
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProspectTest() throws ApiException {
        Long prospectId = null;
        String apiKey = null;
        api.deleteProspect(prospectId, apiKey);

        // TODO: test validations
    }
    
    /**
     * Finds Prospects by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findProspectsByStatusTest() throws ApiException {
        List<String> status = null;
        List<Prospect> response = api.findProspectsByStatus(status);

        // TODO: test validations
    }
    
    /**
     * Finds Prospects by tags
     *
     * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findProspectsByTagsTest() throws ApiException {
        List<String> tags = null;
        List<Prospect> response = api.findProspectsByTags(tags);

        // TODO: test validations
    }
    
    /**
     * Find prospect by ID
     *
     * Returns a single prospect
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProspectByIdTest() throws ApiException {
        Long prospectId = null;
        Prospect response = api.getProspectById(prospectId);

        // TODO: test validations
    }
    
    /**
     * Update an existing prospect
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProspectTest() throws ApiException {
        Prospect body = null;
        api.updateProspect(body);

        // TODO: test validations
    }
    
    /**
     * Updates a prospect in the store with form data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProspectWithFormTest() throws ApiException {
        Long prospectId = null;
        String name = null;
        String status = null;
        api.updateProspectWithForm(prospectId, name, status);

        // TODO: test validations
    }
    
    /**
     * uploads an image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        Long prospectId = null;
        String additionalMetadata = null;
        File file = null;
        GenericResponseMsg response = api.uploadFile(prospectId, additionalMetadata, file);

        // TODO: test validations
    }
    
}
