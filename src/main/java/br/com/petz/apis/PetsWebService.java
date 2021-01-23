package br.com.petz.apis;

import org.junit.Test;

public class PetsWebService {
    private int id;
    private String petName;
    private String status;





    @Test
    public void testJson(){

        PetzWebService test = new PetzWebService("/pet");
        test.sendPostRequest();
    }
}
