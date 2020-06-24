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

package system.workflow.activities.rules;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.codedom.CodeExpression;
import system.workflow.activities.rules.RuleExpressionInfo;
import system.workflow.activities.rules.RuleValidation;
import system.workflow.activities.rules.RuleExpressionResult;
import system.workflow.activities.rules.RuleExecution;
import system.workflow.activities.rules.RuleAnalysis;
import system.workflow.activities.rules.RulePathQualifier;
import system.text.StringBuilder;


/**
 * The base .NET class managing System.Workflow.Activities.Rules.IRuleExpression, System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Implements {@link IJCOBridgeReflected}.
 */
public interface IRuleExpression extends IJCOBridgeReflected {

    public static IRuleExpression ToIRuleExpression(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType("System.Workflow.Activities.Rules.IRuleExpression, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35" : "System.Workflow.Activities"));
        NetType.AssertCast(classType, from);
        return new IRuleExpressionImplementation(from.getJCOInstance());
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
    
    public boolean Match(CodeExpression expression) throws Throwable;

    public CodeExpression Clone() throws Throwable;

    public RuleExpressionInfo Validate(RuleValidation validation, boolean isWritten) throws Throwable;

    public RuleExpressionResult Evaluate(RuleExecution execution) throws Throwable;

    public void AnalyzeUsage(RuleAnalysis analysis, boolean isRead, boolean isWritten, RulePathQualifier qualifier) throws Throwable;

    public void Decompile(StringBuilder stringBuilder, CodeExpression parentExpression) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}