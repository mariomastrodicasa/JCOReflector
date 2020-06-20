/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.data.oledb;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Data.OleDb.OleDbLiteral, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class OleDbLiteral extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.OleDb.OleDbLiteral";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OleDbLiteral(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public OleDbLiteral() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static OleDbLiteral getFrom(JCEnum object, String value) {
        try {
            return new OleDbLiteral(object.fromValue(value));
        } catch (JCException e) {
            return new OleDbLiteral(object);
        }
    }

    // Enum fields section
    
    public static OleDbLiteral Invalid = getFrom(enumReflected, "Invalid");
    public static OleDbLiteral Binary_Literal = getFrom(enumReflected, "Binary_Literal");
    public static OleDbLiteral Catalog_Name = getFrom(enumReflected, "Catalog_Name");
    public static OleDbLiteral Catalog_Separator = getFrom(enumReflected, "Catalog_Separator");
    public static OleDbLiteral Char_Literal = getFrom(enumReflected, "Char_Literal");
    public static OleDbLiteral Column_Alias = getFrom(enumReflected, "Column_Alias");
    public static OleDbLiteral Column_Name = getFrom(enumReflected, "Column_Name");
    public static OleDbLiteral Correlation_Name = getFrom(enumReflected, "Correlation_Name");
    public static OleDbLiteral Cursor_Name = getFrom(enumReflected, "Cursor_Name");
    public static OleDbLiteral Escape_Percent_Prefix = getFrom(enumReflected, "Escape_Percent_Prefix");
    public static OleDbLiteral Escape_Underscore_Prefix = getFrom(enumReflected, "Escape_Underscore_Prefix");
    public static OleDbLiteral Index_Name = getFrom(enumReflected, "Index_Name");
    public static OleDbLiteral Like_Percent = getFrom(enumReflected, "Like_Percent");
    public static OleDbLiteral Like_Underscore = getFrom(enumReflected, "Like_Underscore");
    public static OleDbLiteral Procedure_Name = getFrom(enumReflected, "Procedure_Name");
    public static OleDbLiteral Quote_Prefix = getFrom(enumReflected, "Quote_Prefix");
    public static OleDbLiteral Schema_Name = getFrom(enumReflected, "Schema_Name");
    public static OleDbLiteral Table_Name = getFrom(enumReflected, "Table_Name");
    public static OleDbLiteral Text_Command = getFrom(enumReflected, "Text_Command");
    public static OleDbLiteral User_Name = getFrom(enumReflected, "User_Name");
    public static OleDbLiteral View_Name = getFrom(enumReflected, "View_Name");
    public static OleDbLiteral Cube_Name = getFrom(enumReflected, "Cube_Name");
    public static OleDbLiteral Dimension_Name = getFrom(enumReflected, "Dimension_Name");
    public static OleDbLiteral Hierarchy_Name = getFrom(enumReflected, "Hierarchy_Name");
    public static OleDbLiteral Level_Name = getFrom(enumReflected, "Level_Name");
    public static OleDbLiteral Member_Name = getFrom(enumReflected, "Member_Name");
    public static OleDbLiteral Property_Name = getFrom(enumReflected, "Property_Name");
    public static OleDbLiteral Schema_Separator = getFrom(enumReflected, "Schema_Separator");
    public static OleDbLiteral Quote_Suffix = getFrom(enumReflected, "Quote_Suffix");
    public static OleDbLiteral Escape_Percent_Suffix = getFrom(enumReflected, "Escape_Percent_Suffix");
    public static OleDbLiteral Escape_Underscore_Suffix = getFrom(enumReflected, "Escape_Underscore_Suffix");


    // Flags management section


}