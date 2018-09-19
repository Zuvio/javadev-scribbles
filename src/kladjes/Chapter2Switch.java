package kladjes;

import org.junit.Test;

public class Chapter2Switch {

    @Test
    public int getSortOrder(String firstName,final String lastName){
            String middleName = "Patricia";
            final String suffix = "JR";
            int id = 0;
            switch (firstName) {
                case "Test": //literal dus goed
                    return 52;
//                case middleName: //niet final dus niet goed
//                    id = 5;
//                    break;
                case suffix: // final EN init op zelfde regel dus goed
                    id = 1;
                    break;
//                case lastName: //final maar wordt meegegeven dus niet goed
//                    id = 8;
//                    break;
//                case 5: //int...
//                    id = 7;
//                    break;
//                case 'J': //char...
//                    id = 10;
//                    break;
//                case java.time.DayOfWeek.SUNDAY: //ander objecttype...
//                    id = 15;
//                    break;
            }
            return id;
        }
    }