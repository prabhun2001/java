import java.io.FileInputStream;
class filenotfound{
  public static void main(String[] arg){
    try{
    FileInputStream fin = new FileInputStream("abc.txt");
    int i=0;
            while((i=fin.read())!=-1){
             System.out.print((char)i);
            }
            fin.close();
  }catch(Exception e){
    System.out.println(e);
  }
}
}
