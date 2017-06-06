
package com.networknt.petstore.handler;

import com.networknt.client.Client;
import com.networknt.server.Server;
import com.networknt.exception.ClientException;
import com.networknt.exception.ApiException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class PetPetIdDeleteHandlerTest {
    @ClassRule
    public static TestServer server = TestServer.getInstance();

    static final Logger logger = LoggerFactory.getLogger(PetPetIdDeleteHandlerTest.class);

    @Test
    public void testPetPetIdDeleteHandlerTest() throws ClientException, ApiException {
        CloseableHttpClient client = Client.getInstance().getSyncClient();
        HttpDelete httpDelete = new HttpDelete ("http://localhost:8080/v2/pet/petId");
        /*
        Client.getInstance().addAuthorization(httpDelete);
        try {
            CloseableHttpResponse response = client.execute(httpDelete);
            Assert.assertEquals(200, response.getStatusLine().getStatusCode());
            Assert.assertEquals("", IOUtils.toString(response.getEntity().getContent(), "utf8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
