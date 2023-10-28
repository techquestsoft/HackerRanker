import java.util.concurrent.*;
public class JavaExecutorService {
    private Double whatsInFuture(ExecutorService executor,
                                 Callable<Double> task){
        //lines of code will be place here
        try{
            return executor.submit(task).get();
        }catch (Exception ex){
            return null;
        }
        //3 option compilation error, executer.submit method returns Future,
        // but required double
        /*try{
            return executor.submit(task);
        }catch (Exception ex){
            return null;
        }*/
        //3 option compilation error, execute method takes Runnable as
        // parameter not callable
       /* try{
            return executor.execute(task);
        }catch (Exception ex){
            return null;
        }*/

        // 4. executor service cannot invoke
    }
}
