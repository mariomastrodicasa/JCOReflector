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

package microsoft.jscript;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Microsoft.JScript.JSToken, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class JSToken extends NetObject  {
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.JScript";
    public static final String className = "Microsoft.JScript.JSToken";
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

    public JSToken(Object instance) {
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

    public JSToken() {
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

    final static JSToken getFrom(JCEnum object, String value) {
        try {
            return new JSToken(object.fromValue(value));
        } catch (JCException e) {
            return new JSToken(object);
        }
    }

    // Enum fields section
    
    public static JSToken EndOfFile = getFrom(enumReflected, "EndOfFile");
    public static JSToken If = getFrom(enumReflected, "If");
    public static JSToken For = getFrom(enumReflected, "For");
    public static JSToken Do = getFrom(enumReflected, "Do");
    public static JSToken While = getFrom(enumReflected, "While");
    public static JSToken Continue = getFrom(enumReflected, "Continue");
    public static JSToken Break = getFrom(enumReflected, "Break");
    public static JSToken Return = getFrom(enumReflected, "Return");
    public static JSToken Import = getFrom(enumReflected, "Import");
    public static JSToken With = getFrom(enumReflected, "With");
    public static JSToken Switch = getFrom(enumReflected, "Switch");
    public static JSToken Throw = getFrom(enumReflected, "Throw");
    public static JSToken Try = getFrom(enumReflected, "Try");
    public static JSToken Package = getFrom(enumReflected, "Package");
    public static JSToken Internal = getFrom(enumReflected, "Internal");
    public static JSToken Abstract = getFrom(enumReflected, "Abstract");
    public static JSToken Public = getFrom(enumReflected, "Public");
    public static JSToken Static = getFrom(enumReflected, "Static");
    public static JSToken Private = getFrom(enumReflected, "Private");
    public static JSToken Protected = getFrom(enumReflected, "Protected");
    public static JSToken Final = getFrom(enumReflected, "Final");
    public static JSToken Event = getFrom(enumReflected, "Event");
    public static JSToken Var = getFrom(enumReflected, "Var");
    public static JSToken Const = getFrom(enumReflected, "Const");
    public static JSToken Class = getFrom(enumReflected, "Class");
    public static JSToken Function = getFrom(enumReflected, "Function");
    public static JSToken LeftCurly = getFrom(enumReflected, "LeftCurly");
    public static JSToken Semicolon = getFrom(enumReflected, "Semicolon");
    public static JSToken Null = getFrom(enumReflected, "Null");
    public static JSToken True = getFrom(enumReflected, "True");
    public static JSToken False = getFrom(enumReflected, "False");
    public static JSToken This = getFrom(enumReflected, "This");
    public static JSToken Identifier = getFrom(enumReflected, "Identifier");
    public static JSToken StringLiteral = getFrom(enumReflected, "StringLiteral");
    public static JSToken IntegerLiteral = getFrom(enumReflected, "IntegerLiteral");
    public static JSToken NumericLiteral = getFrom(enumReflected, "NumericLiteral");
    public static JSToken LeftParen = getFrom(enumReflected, "LeftParen");
    public static JSToken LeftBracket = getFrom(enumReflected, "LeftBracket");
    public static JSToken AccessField = getFrom(enumReflected, "AccessField");
    public static JSToken FirstOp = getFrom(enumReflected, "FirstOp");
    public static JSToken LogicalNot = getFrom(enumReflected, "LogicalNot");
    public static JSToken BitwiseNot = getFrom(enumReflected, "BitwiseNot");
    public static JSToken Delete = getFrom(enumReflected, "Delete");
    public static JSToken Void = getFrom(enumReflected, "Void");
    public static JSToken Typeof = getFrom(enumReflected, "Typeof");
    public static JSToken Increment = getFrom(enumReflected, "Increment");
    public static JSToken Decrement = getFrom(enumReflected, "Decrement");
    public static JSToken Plus = getFrom(enumReflected, "Plus");
    public static JSToken FirstBinaryOp = getFrom(enumReflected, "FirstBinaryOp");
    public static JSToken Minus = getFrom(enumReflected, "Minus");
    public static JSToken LogicalOr = getFrom(enumReflected, "LogicalOr");
    public static JSToken LogicalAnd = getFrom(enumReflected, "LogicalAnd");
    public static JSToken BitwiseOr = getFrom(enumReflected, "BitwiseOr");
    public static JSToken BitwiseXor = getFrom(enumReflected, "BitwiseXor");
    public static JSToken BitwiseAnd = getFrom(enumReflected, "BitwiseAnd");
    public static JSToken Equal = getFrom(enumReflected, "Equal");
    public static JSToken NotEqual = getFrom(enumReflected, "NotEqual");
    public static JSToken StrictEqual = getFrom(enumReflected, "StrictEqual");
    public static JSToken StrictNotEqual = getFrom(enumReflected, "StrictNotEqual");
    public static JSToken GreaterThan = getFrom(enumReflected, "GreaterThan");
    public static JSToken LessThan = getFrom(enumReflected, "LessThan");
    public static JSToken LessThanEqual = getFrom(enumReflected, "LessThanEqual");
    public static JSToken GreaterThanEqual = getFrom(enumReflected, "GreaterThanEqual");
    public static JSToken LeftShift = getFrom(enumReflected, "LeftShift");
    public static JSToken RightShift = getFrom(enumReflected, "RightShift");
    public static JSToken UnsignedRightShift = getFrom(enumReflected, "UnsignedRightShift");
    public static JSToken Multiply = getFrom(enumReflected, "Multiply");
    public static JSToken Divide = getFrom(enumReflected, "Divide");
    public static JSToken LastPPOperator = getFrom(enumReflected, "LastPPOperator");
    public static JSToken Modulo = getFrom(enumReflected, "Modulo");
    public static JSToken Instanceof = getFrom(enumReflected, "Instanceof");
    public static JSToken In = getFrom(enumReflected, "In");
    public static JSToken Assign = getFrom(enumReflected, "Assign");
    public static JSToken PlusAssign = getFrom(enumReflected, "PlusAssign");
    public static JSToken MinusAssign = getFrom(enumReflected, "MinusAssign");
    public static JSToken MultiplyAssign = getFrom(enumReflected, "MultiplyAssign");
    public static JSToken DivideAssign = getFrom(enumReflected, "DivideAssign");
    public static JSToken BitwiseAndAssign = getFrom(enumReflected, "BitwiseAndAssign");
    public static JSToken BitwiseOrAssign = getFrom(enumReflected, "BitwiseOrAssign");
    public static JSToken BitwiseXorAssign = getFrom(enumReflected, "BitwiseXorAssign");
    public static JSToken ModuloAssign = getFrom(enumReflected, "ModuloAssign");
    public static JSToken LeftShiftAssign = getFrom(enumReflected, "LeftShiftAssign");
    public static JSToken RightShiftAssign = getFrom(enumReflected, "RightShiftAssign");
    public static JSToken LastBinaryOp = getFrom(enumReflected, "LastBinaryOp");
    public static JSToken UnsignedRightShiftAssign = getFrom(enumReflected, "UnsignedRightShiftAssign");
    public static JSToken LastAssign = getFrom(enumReflected, "LastAssign");
    public static JSToken ConditionalIf = getFrom(enumReflected, "ConditionalIf");
    public static JSToken Colon = getFrom(enumReflected, "Colon");
    public static JSToken Comma = getFrom(enumReflected, "Comma");
    public static JSToken LastOp = getFrom(enumReflected, "LastOp");
    public static JSToken Case = getFrom(enumReflected, "Case");
    public static JSToken Catch = getFrom(enumReflected, "Catch");
    public static JSToken Debugger = getFrom(enumReflected, "Debugger");
    public static JSToken Default = getFrom(enumReflected, "Default");
    public static JSToken Else = getFrom(enumReflected, "Else");
    public static JSToken Export = getFrom(enumReflected, "Export");
    public static JSToken Extends = getFrom(enumReflected, "Extends");
    public static JSToken Finally = getFrom(enumReflected, "Finally");
    public static JSToken Get = getFrom(enumReflected, "Get");
    public static JSToken Implements = getFrom(enumReflected, "Implements");
    public static JSToken Interface = getFrom(enumReflected, "Interface");
    public static JSToken New = getFrom(enumReflected, "New");
    public static JSToken Set = getFrom(enumReflected, "Set");
    public static JSToken Super = getFrom(enumReflected, "Super");
    public static JSToken RightParen = getFrom(enumReflected, "RightParen");
    public static JSToken RightCurly = getFrom(enumReflected, "RightCurly");
    public static JSToken RightBracket = getFrom(enumReflected, "RightBracket");
    public static JSToken PreProcessorConstant = getFrom(enumReflected, "PreProcessorConstant");
    public static JSToken Comment = getFrom(enumReflected, "Comment");
    public static JSToken UnterminatedComment = getFrom(enumReflected, "UnterminatedComment");
    public static JSToken Assert = getFrom(enumReflected, "Assert");
    public static JSToken Boolean = getFrom(enumReflected, "Boolean");
    public static JSToken Byte = getFrom(enumReflected, "Byte");
    public static JSToken Char = getFrom(enumReflected, "Char");
    public static JSToken Decimal = getFrom(enumReflected, "Decimal");
    public static JSToken Double = getFrom(enumReflected, "Double");
    public static JSToken DoubleColon = getFrom(enumReflected, "DoubleColon");
    public static JSToken Enum = getFrom(enumReflected, "Enum");
    public static JSToken Ensure = getFrom(enumReflected, "Ensure");
    public static JSToken Float = getFrom(enumReflected, "Float");
    public static JSToken Goto = getFrom(enumReflected, "Goto");
    public static JSToken Int = getFrom(enumReflected, "Int");
    public static JSToken Invariant = getFrom(enumReflected, "Invariant");
    public static JSToken Long = getFrom(enumReflected, "Long");
    public static JSToken Namespace = getFrom(enumReflected, "Namespace");
    public static JSToken Native = getFrom(enumReflected, "Native");
    public static JSToken Require = getFrom(enumReflected, "Require");
    public static JSToken Sbyte = getFrom(enumReflected, "Sbyte");
    public static JSToken Short = getFrom(enumReflected, "Short");
    public static JSToken Synchronized = getFrom(enumReflected, "Synchronized");
    public static JSToken Transient = getFrom(enumReflected, "Transient");
    public static JSToken Throws = getFrom(enumReflected, "Throws");
    public static JSToken ParamArray = getFrom(enumReflected, "ParamArray");
    public static JSToken Volatile = getFrom(enumReflected, "Volatile");
    public static JSToken Ushort = getFrom(enumReflected, "Ushort");
    public static JSToken Uint = getFrom(enumReflected, "Uint");
    public static JSToken Ulong = getFrom(enumReflected, "Ulong");
    public static JSToken Use = getFrom(enumReflected, "Use");
    public static JSToken EndOfLine = getFrom(enumReflected, "EndOfLine");
    public static JSToken PreProcessDirective = getFrom(enumReflected, "PreProcessDirective");
    public static JSToken None = getFrom(enumReflected, "None");


    // Flags management section


}