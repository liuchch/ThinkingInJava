package chapter15.section14;

import java.util.ArrayList;
import java.util.List;

interface Processor<T, E extends Exception> {
    void process(List<T> resultCollector) throws E;
}

class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
    List<T> processAll() throws E {
        List<T> resultCollector = new ArrayList<>();
        for (Processor<T,E> processor : this) {
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}

public class ThrowGenericException {
}
