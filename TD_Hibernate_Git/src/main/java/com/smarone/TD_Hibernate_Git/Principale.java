package com.smarone.TD_Hibernate_Git;

import com.Model.Client;
import com.Service.Session;


public class Principale 
{
    public static void main( String[] args )
    {
        ClientServices cs = new ClientService();
        Client c1 = new Client("MARONE", "Joel Birame");
    }
}
