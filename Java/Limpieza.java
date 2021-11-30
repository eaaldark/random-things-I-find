

byte[] bytes = getByteArray();
java.io.ByteArrayOutputStream fixedData = new java.io.ByteArrayOutputStream();

if(bytes.length > 2)
{
  System.out.println("Validando archivo..");
  //if(bytes[bytes.length - 2] != 13 && bytes[bytes.length-1] == 10)
  //if(bytes[bytes.length - 2] == 10 && bytes[bytes.length-1] != 13)
 
  int count = 0;
 
  //bytes[bytes.length - 1] == 10
  if(bytes[10] == 44)
  {
      while( count < (bytes.length))
      {
        if(bytes[count] == 44)
        {
          bytes[count]=59;
        }
        count ++;
      }
     
      try
      {
          System.out.println("Corrigiendo archivo..");
                
          //fixedData.write(bytes, 0, bytes.length - 2);
          fixedData.write(bytes);
          //fixedData.write(13);
          setData(fixedData.toString());
         
          //fixedData.write(bytes);
          //fixedData.write(13);
          //fixedData.write(10);
      }
      catch (Exception e)
      {
          System.out.println("Error en funcion fixFileEndingEnter: " + e.getMessage());
          e.printStackTrace();
      }  
  }
}
return "";