package spec.concordion.common.command.run;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SuccessFixture {

    public void throwException() throws Exception {
        throw new Exception();
    }
}
