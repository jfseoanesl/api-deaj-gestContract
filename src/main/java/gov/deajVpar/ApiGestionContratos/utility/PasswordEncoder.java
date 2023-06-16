/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.utility;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import at.favre.lib.crypto.bcrypt.BCrypt;


/**
 *
 * @author Jairo F
 */
public class PasswordEncoder {
//    private static BCryptPasswordEncoder encoder;
//
//    private PasswordEncoder() {
//        encoder = new BCryptPasswordEncoder(16);
//    }
//    
//    public static BCryptPasswordEncoder get(){
//        if(encoder == null){
//           new PasswordEncoder();
//        }
//        return encoder;
//    }
    
    public static boolean verifiedPasswordEncrypted(String password, String bcryptHashString){
      BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), bcryptHashString);
      return result.verified;
    }
    
    
    
}
