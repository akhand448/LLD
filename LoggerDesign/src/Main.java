import com.loggingProcessor.akhand.DebugLogProcessor;
import com.loggingProcessor.akhand.ErrorLogProcessor;
import com.loggingProcessor.akhand.InfoLogProcessor;
import com.loggingProcessor.akhand.LogProcessor;

public class Main {
    public static void main(String[] args) {

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(3,"LogProcessor Executed Successfully");
        logObject.log(1,"LogProcessor Executed Successfully");
        logObject.log(2,"LogProcessor Executed Successfully");
    }
}