package test;

import main.java.others.ItemType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTypeTest {

    @Test
    void testItemTypeCreation() {
        ItemType itemType = new ItemType(1, "Electronics", 50);
        assertNotNull(itemType);
        assertEquals(1, itemType.getItemTypeID());
        assertEquals("Electronics", itemType.getItemTypeName());
        assertEquals(50, itemType.getTotalItems());
    }
}
