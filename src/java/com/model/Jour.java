
package com.model;




public class Jour {
    
  
    
    public String afficher (int jour)
    {
        String jours="";
        switch (jour) {
            
            case 1:  jours= "lundi";
                     break;
            case 2:  jours="mardi";
                     break;
            case 3:  jours="mercredi";
                     break;
            case 4:  jours="jeudi";
                     break;
            case 5:  jours="vendredi";
                     break;
            case 6:  jours="samedi";
                     break;
            case 7:  jours="dimanche";
                     break;
             default: jours="erreur";
                     break;
                        
        }
            
    return jours;
    }
    
}

