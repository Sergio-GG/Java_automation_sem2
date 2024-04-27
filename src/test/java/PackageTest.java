import org.example.BoxContainer;
import org.example.Gift;
import org.example.Tool;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PackageTest {
    @Test
    public void checkCost(){
        //given
        Tool tool = new Tool(50);
        Gift gift = new Gift(20);
        BoxContainer bc1 = new BoxContainer();
        BoxContainer bc2 = new BoxContainer();
        bc1.addPackage(tool);
        bc2.addPackage(gift);
        bc2.addPackage(bc1);
        //when
        int res1 = bc1.cost();
        int res2 = bc2.cost();
        //then
        Assertions.assertEquals(50, res1);
        Assertions.assertEquals(70, res2);
    }
    @Test
    public void checkBoxSize(){
        //given
        BoxContainer boxContainer1 = new BoxContainer();
        BoxContainer boxContainer2 = new BoxContainer();
        boxContainer1.setPackages(List.of(new Tool(10), new Gift(60)));
        boxContainer2.setPackages(List.of(boxContainer1, new Tool(30)));
        //when
        int size1 = boxContainer1.getPackages().size();
        int size2 = boxContainer2.getPackages().size();
        //then
        Assertions.assertEquals(2, size1);
        Assertions.assertEquals(2, size2);
    }
}
