package com.pluralsight;

import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ContractFileManager {

    public void saveContract(Contract contract) {
        try (BufferedWriter = new BufferedWriter(new FileWriter("contracts.csv, true "))) {
            //Lease instance
            if (contract instanceof LeaseContract){
                writer.write(StringSelection.format)
            }
        }
    }
}
