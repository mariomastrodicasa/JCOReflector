# JCOReflector (a .NET Java wrapper)

![CI_WINDOWS](https://github.com/masesgroup/JCOReflector/workflows/CI_WINDOWS/badge.svg)  ![CI_LINUX](https://github.com/masesgroup/JCOReflector/workflows/CI_LINUX/badge.svg)  [![CI_DOCS](https://github.com/masesgroup/JCOReflector/actions/workflows/docs.yaml/badge.svg)](https://github.com/masesgroup/JCOReflector/actions/workflows/docs.yaml)  [![CI_MAVEN](https://github.com/masesgroup/JCOReflector/actions/workflows/maven.yaml/badge.svg)](https://github.com/masesgroup/JCOReflector/actions/workflows/maven.yaml)  ![CI_RELEASE](https://github.com/masesgroup/JCOReflector/workflows/CI_RELEASE/badge.svg)

[![JCOReflector .NET Framework Maven Central](https://img.shields.io/maven-central/v/com.masesgroup/jcoreflector_net461.svg?label=JCOReflector%20.NET%20Framework%20Maven%20Central)](https://search.maven.org/search?q=g:%22com.masesgroup%22%20AND%20a:%22jcoreflector_net461%22)  [![JCOReflector .NET 5 Maven Central](https://img.shields.io/maven-central/v/com.masesgroup/jcoreflector_net5.0.svg?label=JCOReflector%20.NET%205%20Maven%20Central)](https://search.maven.org/search?q=g:%22com.masesgroup%22%20AND%20a:%22jcoreflector_net5.0%22)

## The project

JCOReflector produce a set of **.NET wrapper for Java** as JARs that are available for download. It's simple to use: you only need to reference JCOReflector.jar in the class-path and use the .NET API within your Java projects like exposed in the example section. 

The core of the project is the innovative JCOReflector, a reflection engine which automatically writes Java classes using .NET class reflection.
JCOReflector can be used to reflects any .NET assembly (even assembly outside the Microsoft ones) into JARs.
The generated wrapper classes are based on the powerful [JCOBridge](https://www.jcobridge.com) engine and extends its use to simplify the use of .NET from Java(JVM).
It was created internally from us to support our customers, now we made it available for everyone.

This project adheres to the Contributor [Covenant code of conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code. Please report unacceptable behavior to coc_reporting@masesgroup.com.

## History of the project

This project started in 2019 with the aims to create a set of Java (JVM) classes which mimic .NET (Framework/Core) conterparts, in May 2020 the first commit in GitHub.
Using this project it is possible to use .NET API in Java and all JVM enabled languages (Scala, Kotlin, and so on).
The final output of JCOReflector are JARs.
At its first stages no JARs was available: only the JCOBridge engine, the graphical UI that helps to manages reflection and the operations needed to finally build JARs was relased.
Starting from recent relases automated continous integration and verification process are in places, so the produced JARs are directly available for download and is no more needed to manually rebuils JARs before use it. 
Anyway still possible to use JCOReflector to reflects any .NET assembly (even assembly outside the Microsoft ones) into JARs, and because JCOReflector uses templates it is not necessary to manually manages the output, special needs can be addressed dirctly inside the templates.

## Simple example

```java

package mscorlib;

import system.*;
import system.io.*;

public class HelloNET {
    public static void main(String[] args) {
        try {
            String filename = "test.txt";
            String result = "";
            if (File.Exists(filename)) {
                result = File.ReadAllText(filename);
				Console.WriteLine(result);
                result = result + "Java Execution ";
                File.WriteAllText(filename, result);
            }
            Console.WriteLine(result);
            Console.WriteLine("Exiting");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (Throwable tre) {
            tre.printStackTrace();
        }
        return;
    }
}

```

This is the result:

```
prompt> This is a text file for read/write operation
prompt> This is a text file for read/write operation Java Execution
prompt> Exiting
```

To run it runs a command like the following one:

> java -cp JCOReflector.jar;. HelloNET

The full example code, and other ones, are in the project test folder.

A basic Scala examples is the following one:

```scala
package mscorlib

import system.Console
import system.Environment

object HelloIterator {
  def main(args: scala.Array[String]): Unit = {
    try {
      Environment.GetLogicalDrives.foreach(Console.WriteLine(_))
      Environment.Exit(0)
    } catch {
      case tre: Throwable =>
        tre.printStackTrace()
    }
  }
}
```

the same example written in Kotlin is the following one:

```kotlin
package mscorlib

import system.Console
import system.Environment

object HelloIterator {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            for (drive in Environment.GetLogicalDrives()) {
                Console.WriteLine(drive)
            }
            Environment.Exit(0)
        } catch (tre: Throwable) {
            tre.printStackTrace()
        }
    }
}
```

### Whats in .NET for Java?

From the point of view of .NET it is very simple to use Java classes and it is not necessary to have some kind of reflection classes.
[JCOBridge](https://www.jcobridge.com) is able to access and execute directly within a JVM using C# code, from C# it is possible to execute directly Java code with a similar syntax: look at the examples in [JCOBridge-Examples](https://github.com/masesgroup/JCOBridge-Examples)

## Actual state

The JCOBridge is a mature platform for .NET assembly reflection, the .NET wrapper JARs are available and cover most of the .NET framework functionality.  
The reflector executables, available for both Framework and CoreCLR, is limited in the following features:

### Implemented in the reflector

- Only public Types are available
- Classes and public accessible methods
- Interface
- Enum: enumeration and flags are available
- .NET exception are translated and thrown in code
- Static classes are managed
- Events
- Arrays: partial support
- Inheritance
- Native types managed from JCOBridge are directly mapped to native Java type
- Base types (System.Object, System.Type, System.Enum, System.Exception, System.Collections.ArrayList) are mapped to specific type into a support library (**JCOReflector.jar**)
- Management of thrown declaration as expected in Java: a generic Throwable is used with all exceptions found in code (used the algorithm in https://stackoverflow.com/questions/986180/how-can-i-determine-which-exceptions-can-be-thrown-by-a-given-method and code from https://docs.microsoft.com/en-us/archive/blogs/haibo_luo/)
- Documentation

### Not implemented in reflector:

- Out/Ref parameters: you need to write code using JCOBridge API
- Generic types
- Method decoration (Attributes)
- Unsafe methods
- Fields

### Limitations

C# and Java are different languages. The reflection process cannot reflects into Java some features available on C#: an example are properties where get/set is automatically choosed from C# compiler
Other limitations comes from some differences between the two engines (CLR and JVM).
In all cases [JCOBridge](https://www.jcobridge.com) superside these limitations, but manual operations shall be made: do not change the reflected classes, override them in your code.

## How to use the generator tool (JCOReflector)

In the root folder execute:

> dotnet build JCOReflector\JCOReflector.sln

or

> dotnet build JCOReflector\JCOReflectorCLI.sln

Within the folder bin you will find three subfolders:

- **net461** (available only on Windows platform)
- **netcoreapp3.1** (available on .NET Core supported platforms)
- **net5.0** (available on .NET 5 supported platforms)

in each subfolder will be available two executables:

- **JCOReflectorCLI** the CLI tool;
- **JCOReflectorGUI** the GUI tool, below some screenshot:

![JCOReflector](/assets/images/jcoreflector.png?raw=true "JCOReflector screenshot")
![JCOReflector](/assets/images/jcoreflector2.png?raw=true "JCOReflector screenshot")

## Reflected Assemblies

The folder [netreflected](/netreflected/src) contains all reflected classes generated for **.NET** **Framework** (_net461_), **Core** (_netcoreapp3.1_) and **5** (_net5.0_). Below the coverage statistics and the list of analyzed and reflected assemblies:

### Statistics

![FrameworkStatistic](https://docs.google.com/spreadsheets/d/e/2PACX-1vRKe-7bBH40JmQmq4I194xz9g2YsoU7L9fHwzY0fqZyWepyjqnOC0B7lgO9CjAuTrBkOA8qbTiScLpS/pubchart?oid=1238429091&format=image)

![FrameworkStatisticPercent](https://docs.google.com/spreadsheets/d/e/2PACX-1vRKe-7bBH40JmQmq4I194xz9g2YsoU7L9fHwzY0fqZyWepyjqnOC0B7lgO9CjAuTrBkOA8qbTiScLpS/pubchart?oid=485555819&format=image)

![NetcoreStatistic](https://docs.google.com/spreadsheets/d/e/2PACX-1vRKe-7bBH40JmQmq4I194xz9g2YsoU7L9fHwzY0fqZyWepyjqnOC0B7lgO9CjAuTrBkOA8qbTiScLpS/pubchart?oid=964222969&format=image)

![NetcoreStatisticPercent](https://docs.google.com/spreadsheets/d/e/2PACX-1vRKe-7bBH40JmQmq4I194xz9g2YsoU7L9fHwzY0fqZyWepyjqnOC0B7lgO9CjAuTrBkOA8qbTiScLpS/pubchart?oid=857533338&format=image)

![Net5Statistic](https://docs.google.com/spreadsheets/d/e/2PACX-1vRKe-7bBH40JmQmq4I194xz9g2YsoU7L9fHwzY0fqZyWepyjqnOC0B7lgO9CjAuTrBkOA8qbTiScLpS/pubchart?oid=212559398&format=image)

![Net5StatisticPercent](https://docs.google.com/spreadsheets/d/e/2PACX-1vRKe-7bBH40JmQmq4I194xz9g2YsoU7L9fHwzY0fqZyWepyjqnOC0B7lgO9CjAuTrBkOA8qbTiScLpS/pubchart?oid=1162005117&format=image)

