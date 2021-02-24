import java.io.BufferedReader;
import java.io.IOException;

public class CreateThread implements Runnable {
    private BufferedReader in;
    private int i;

    public CreateThread(BufferedReader in, int i){
        this.in = in;
        this.i = i;
    }

    @Override
    publi
               /* if (in.readLine() == "/quit") {
                    //return;
                } else {
                    System.out.println("Menssage: " + in.readLine());
                }*/
                System.out.println("Menssag from user-"+i+" "+in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
