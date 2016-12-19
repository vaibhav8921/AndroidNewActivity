package androidsample.mycompany.com.androidnewactivity;

/**
 * Created by ashwani on 12/14/16.
 */

public class AsyncTaskResult {
    public RESULT_ENUM getResult() {
        return result;
    }

    public void setResult(RESULT_ENUM result) {
        this.result = result;
    }

    private RESULT_ENUM result;

    public void setError(Exception error) {
        this.error = error;
    }

    private Exception error;



    public Exception getError() {
        return error;
    }




    public enum  RESULT_ENUM{
        SUCCESS,
        FAILURE;

    }
}