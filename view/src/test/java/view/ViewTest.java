package view;

import model.Model;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViewTest {
    @Test
    public void TestView() {
        View view = new View(new Model());
    }
}