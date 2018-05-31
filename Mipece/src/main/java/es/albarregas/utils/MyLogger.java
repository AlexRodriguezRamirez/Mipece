/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.utils;

/**
 *
 * @author Alex
 */
public class MyLogger {
 
    public static void doLog(Exception excepcion, Class clase, String nivel) {
         
        System.setProperty("logPath", clase.getSimpleName());
        System.setProperty("projectName", "20180503_Alex");
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(clase);
 
        String out = "Línea: " + excepcion.getStackTrace()[0].getLineNumber()
                + " Causa: " + excepcion;
 
        switch (nivel) {
 
            case "fatal":
                logger.fatal(out);
                break;
            case "warn":
                logger.warn(out);
                break;
            case "error":
                logger.error(out);
                break;
            default:
                logger.info(out);
                 
        }
         
    }
     
}