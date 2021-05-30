package com;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AddressBookTest {
    static AddressBook addressBook;

    @BeforeClass
    public static void createAddressBookObj() {
        addressBook = new AddressBook(null);
    }
    @Test
    public void given2EmployeeDetails_whenWrittenToFile_ShouldMatchWithEntries() {
        Contact[] arrayOfEmps = { new Contact("Aishwarya", "Muthyala", "rmngr", "knr", "Tg", "505001", "9876543210", "aish@gmail.com", 0),
                new Contact("Panu", "Muthyala", "algnr", "knr", "Tg", "505002", "9123456780", "panu@gmail.com", 0)
        };
        addressBook = new AddressBook(Arrays.asList(arrayOfEmps));
        AddressBook.writeAddressBookData(com.AddressBook.IOService.FILE_IO);
        long entries = AddressBookFileIOService.countEntries(com.AddressBook.IOService.FILE_IO);
        Assertions.assertEquals(2, entries);
    }
}
