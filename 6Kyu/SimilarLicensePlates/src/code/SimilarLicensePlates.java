/*package code;

public class SimilarLicensePlates {
    public static boolean similarLicensePlates( String plate1, String plate2 ) {
        boolean isSimilar = false;
        boolean contains = false;
        boolean charSame = true;

        int i = 0;

        char[][] similarCharArray = {{'0','O','Q'}, {'1','I','T'}, {'2','Z'}, {'5','S'}, {'8','B'}};




        char[] plate1char = plate1.toCharArray();
        char[] plate2char = plate2.toCharArray();


        for (char c : plate1char) {
            if (c == plate1char[i] ) {
                contains = true;
                break;
            }



            // plate1char[i] == plate2char[i] || contains = true ||  ?

            while (charSame = true && i <= plate1.length()){

            }

            return isSimilar;
        }


}

class Challenge {
    public static boolean similarLicensePlates(String plate1, String plate2) {
        boolean isSimilar = false;
        boolean contains = false;

        int i = 0;

        char[][] similarCharArray = {{'0', 'O', 'Q'}, {'1', 'I', 'T'}, {'2', 'Z'}, {'5', 'S'}, {'8', 'B'}};

        char[] plate1char = plate1.toCharArray();
        char[] plate2char = plate2.toCharArray();

        //  plate1char[i] == plate2char[i] ? isSimilar == true :

        int p1x = 0;
        int p2x = 0;
        return true;
    }}
/*
            for (int x = 0; x < similarCharArray.length; x++;) {
                for (int y = 0; y < similarCharArray[x].length; y++;) {
                    if (plate1char[i] == similarCharArray[j][k]) {
                        contains = true;
                        //p1x = x;
                    } else {
                        contains = false;
                    }
                }

                for (int j = 0; j ; i++) {
                    if (plate2char[i] == similarCharArray[j][k]){
                        contains = true;
                        p2x = j;
                    }
                    //boolean p1x == p2x ? true : false;
                }
            }


            return isSimilar;
        }
    }


}








//  function bothcontain(containsSimilarChar(plate1char), containsSimilarChar(plate2char))

  /*
  function similarLicensePlates(plate1, plate2) {


  let isSimilar = false;


  let similarCharArray = [
  ['0','O','Q'], //1.
  ['1','I','T'], //2.
  ['2','Z'],     //3.
  ['5','S'],     //4.
  ['8','B']      //5.
  ];

  let nospace1plate = plate1.replace(/ /g,'');
  let nospace2plate = plate2.replace(/ /g,'');
  let plate1char = nospace1plate.split('');
  let plate2char = nospace2plate.split('');



  function containsSimilarChar(charArray, similarCharArray){
   let contains = false;
   let positionX = [];
   let count;
   let x;
   let y;


   for (count = 0; count < charArray.length; count++) {
    for (x = 0; x < similarCharArray.length; x++) {
     for (y = 0; y < similarCharArray[x].length; y++) {
      if (charArray[count] == similarCharArray[x][y]) {
          contains = true;
          positionX[count] = x;
         }
        }
       }
      }  return {
                   position: positionX,
                   bool: contains
                };
    }


  for (i = 0; i < plate1.length; i++) {
     const result = [0, 0, 0];
     charPosRes1  = containsSimilarChar(plate1char, similarCharArray);
     charPosRes2  = containsSimilarChar(plate2char, similarCharArray);
     let a = charPosRes1.bool //storing whether the array contains a special character
     let b = charPosRes2.bool //storing whether the array contains a special character
     let posXA = charPosRes1.position.toString();
     let posXB = charPosRes2.position.toString();


     if (plate1char[i] !== plate2char[i] && (!a && !b)){
         return isSimilar = false;
        } else if (plate1char[i] == plate2char[i] && (!a && !b)) {
          for (j = 0; j < plate1.length; j++) {
            result[j] = 1;
            console.log(result)
          }
        } else if (a && b) {
           for (j = 0; j < plate1.length; j++) {

              if (plate1char[j] == plate2char[j]){
                     result[j] = 1;
                 } else if (posXA == posXB) {
                     result[j] = 2;
                 } else {
                   result[j] =0;
                 }
               }
           } else {
                 isSimilar = false;
               }
result.includes(0) ? isSimilar = false : isSimilar = true;


  return isSimilar;
   }
}









   */


/* Tests
let assert = require("chai").assert;
describe('similar_license_plates', function() {
  it('should handle the examples', function() {
    assert.equal(similarLicensePlates("ABC","DEF"), false);
 assert.equal(similarLicensePlates("AAA","A A A"), true);
 assert.equal(similarLicensePlates("BOX","B0X"), true);
 assert.equal(similarLicensePlates("BIZ","812"), true);
   });
});

 */