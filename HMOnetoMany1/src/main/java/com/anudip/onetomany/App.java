package com.anudip.onetomany;

import com.anudip.onetomany.daoimpl.TrainerDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TrainerDaoImpl tdao = new TrainerDaoImpl();
       // tdao.insert();
    	tdao.read();
    }
}
