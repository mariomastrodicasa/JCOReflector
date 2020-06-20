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

package system.codedom.compiler;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.codedom.CodeTypeDeclaration;
import system.io.TextWriter;
import system.codedom.compiler.CodeGeneratorOptions;
import system.codedom.CodeExpression;
import system.codedom.CodeStatement;
import system.codedom.CodeTypeReference;
import system.codedom.compiler.GeneratorSupport;
import system.codedom.CodeNamespace;
import system.codedom.CodeCompileUnit;


/**
 * The base .NET class managing System.CodeDom.Compiler.ICodeGenerator, System.CodeDom, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Implements {@link IJCOBridgeReflected}.
 */
public interface ICodeGenerator extends IJCOBridgeReflected {

    public static ICodeGenerator ToICodeGenerator(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.CodeDom, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51");
        JCType classType = bridge.GetType("System.CodeDom.Compiler.ICodeGenerator, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.CodeDom, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51" : "System.CodeDom"));
        NetType.AssertCast(classType, from);
        return new ICodeGeneratorImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public void GenerateCodeFromType(CodeTypeDeclaration e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void GenerateCodeFromExpression(CodeExpression e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void GenerateCodeFromStatement(CodeStatement e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public boolean IsValidIdentifier(java.lang.String value) throws Throwable;

    public java.lang.String CreateEscapedIdentifier(java.lang.String value) throws Throwable;

    public java.lang.String CreateValidIdentifier(java.lang.String value) throws Throwable;

    public java.lang.String GetTypeOutput(CodeTypeReference type) throws Throwable;

    public boolean Supports(GeneratorSupport supports) throws Throwable;

    public void GenerateCodeFromNamespace(CodeNamespace e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void GenerateCodeFromCompileUnit(CodeCompileUnit e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void ValidateIdentifier(java.lang.String value) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}