import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Euler2Test {


    @Test
    public void shouldReturnFor13() {
        //given
        Euler2 euler2 = new Euler2();
        int x = 13;
        //when
        int calc = euler2.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(10));
    }

    @Test
    public void shouldReturnFor15() {
        //given
        Euler2 euler2 = new Euler2();
        int x = 15;
        //when
        int calc = euler2.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(10));
    }

    @Test
    public void shouldReturnFor34() {
        //given
        Euler2 euler2 = new Euler2();
        int x = 34;
        //when
        int calc = euler2.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(44));
    }
}
