package com.santoni;

import com.santoni.operation.*;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;

public class MyConfiguredCalculator extends Calculator {

    MyConfiguredCalculator(OutputStream outputStream){
        super(new CommandParser(),
                new HashMap<String, Operation>(){{
                    put("DISPLAY", new DisplayOperation(outputStream));
                    put("ADD", new AddOperation());
                    put("SUBSTRACT", new SubstractOperation());
                    put("DIVIDE BY", new DivideByOperation());
                    put("MULTIPLY BY", new MultiplyByOperation());
                }}
        );
    }
}
