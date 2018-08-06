/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebankclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.Base64;

/**
 *
 * @author james
 */
public class OnlineBankService {

    private final String authorisationHeader;

    public OnlineBankService(String pps, String password) {
        //encode the string username:password        
        String plainTextToken = pps + ":" + password;
        String base64Token = new String(Base64.encode(plainTextToken));

        //set the authorization header
        authorisationHeader = "Basic " + base64Token;
    }

    public String getAllCustomers() {
        String getUrl = "http://localhost:49000/api/customers";

        Client client = Client.create();
        WebResource target = client.resource(getUrl);//ask the client to give a refernce to the web resource so you can interact with resource

        ClientResponse response = target
                .header("Content-Type", "application/json")
                .header("Authorization", authorisationHeader)
                .get(ClientResponse.class);

        return response.getEntity(String.class);
    }

    public String addCustomer(String customer) {
        try {
            Client client = Client.create();

            String url = "http://localhost:49000/api/customers";

            WebResource webResource = client.resource(url);

            ClientResponse response = webResource.header("Content-Type", "application/json")
                    .header("Authorization", authorisationHeader)
                    .type("application/json")
                    .post(ClientResponse.class, customer);////want to interact in json 

            return response.getEntity(String.class);//get the content of the response

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String updateCustomer(int customerId, String customer) {
        try {
            Client client = Client.create();

            String url = "http://localhost:49000/api/customers/" + customerId;

            WebResource webResource = client.resource(url);

            ClientResponse response = webResource.header("Content-Type", "application/json")
                    .header("Authorization", authorisationHeader)
                    .type("application/json")
                    .put(ClientResponse.class, customer);////want to interact in json 

            return response.getEntity(String.class);//get the content of the response

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String deleteCustomer(int customerId) {
        try {
            Client client = Client.create();

            String url = "http://localhost:49000/api/customers/" + customerId;

            WebResource webResource = client.resource(url);

            ClientResponse response = webResource.header("Content-Type", "application/json")
                    .header("Authorization", authorisationHeader)
                    .type("application/json")
                    .delete(ClientResponse.class);////want to interact in json 

            return response.getEntity(String.class);//get the content of the response

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String getAllAccounts(int customerId){
        String getUrl = "http://localhost:49000/api/customers/"+customerId;

        Client client = Client.create();
        WebResource target = client.resource(getUrl);//ask the client to give a refernce to the web resource so you can interact with resource

        ClientResponse response = target
                .header("Content-Type", "application/json")
                .header("Authorization", authorisationHeader)
                .get(ClientResponse.class);

        return response.getEntity(String.class);
    }
    
    public String getAccount(int customerId, int accountNo){
        String getUrl = "http://localhost:49000/api/customers/"+customerId+"/accounts/"+accountNo;

        Client client = Client.create();
        WebResource target = client.resource(getUrl);//ask the client to give a refernce to the web resource so you can interact with resource

        ClientResponse response = target
                .header("Content-Type", "application/json")
                .header("Authorization", authorisationHeader)
                .get(ClientResponse.class);

        return response.getEntity(String.class);
    }
    
    public String addAccount(int customerId, String account){
         try {
            Client client = Client.create();

            String url = "http://localhost:49000/api/customers/"+customerId+"/accounts";

            WebResource webResource = client.resource(url);

            ClientResponse response = webResource.header("Content-Type", "application/json")
                    .header("Authorization", authorisationHeader)
                    .type("application/json")
                    .post(ClientResponse.class, account);////want to interact in json 

            return response.getEntity(String.class);//get the content of the response

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String updateAccountBranch(int customerId, int accountNo, String account){
            try {
            Client client = Client.create();

            String url = "http://localhost:49000/api/customers/" + customerId+"/accounts/"+accountNo;

            WebResource webResource = client.resource(url);

            ClientResponse response = webResource.header("Content-Type", "application/json")
                    .header("Authorization", authorisationHeader)
                    .type("application/json")
                    .put(ClientResponse.class, account);////want to interact in json 

            return response.getEntity(String.class);//get the content of the response

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String deleteAccount(int customerId, int accountNo){
                try {
            Client client = Client.create();

            String url = "http://localhost:49000/api/customers/" + customerId+"/accounts/"+accountNo;

            WebResource webResource = client.resource(url);

            ClientResponse response = webResource.header("Content-Type", "application/json")
                    .header("Authorization", authorisationHeader)
                    .type("application/json")
                    .delete(ClientResponse.class);////want to interact in json 

            return response.getEntity(String.class);//get the content of the response

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
        
    }
    
}
