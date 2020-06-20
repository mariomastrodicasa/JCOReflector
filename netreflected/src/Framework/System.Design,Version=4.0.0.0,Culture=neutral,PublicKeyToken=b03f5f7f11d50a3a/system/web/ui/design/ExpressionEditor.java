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

package system.web.ui.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.design.ExpressionEditor;
import system.IServiceProvider;
import system.IServiceProviderImplementation;
import system.web.ui.design.ExpressionEditorSheet;


/**
 * The base .NET class managing System.Web.UI.Design.ExpressionEditor, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ExpressionEditor extends NetObject  {
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Design";
    public static final String className = "System.Web.UI.Design.ExpressionEditor";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public ExpressionEditor(Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }

    public static ExpressionEditor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ExpressionEditor(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static ExpressionEditor GetExpressionEditor(java.lang.String expressionPrefix, IServiceProvider serviceProvider) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ObjectDisposedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetExpressionEditor = (JCObject)classType.Invoke("GetExpressionEditor", expressionPrefix, serviceProvider == null ? null : serviceProvider.getJCOInstance());
            return new ExpressionEditor(objGetExpressionEditor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ExpressionEditorSheet GetExpressionEditorSheet(java.lang.String expression, IServiceProvider serviceProvider) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetExpressionEditorSheet = (JCObject)classInstance.Invoke("GetExpressionEditorSheet", expression, serviceProvider == null ? null : serviceProvider.getJCOInstance());
            return new ExpressionEditorSheet(objGetExpressionEditorSheet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject EvaluateExpression(java.lang.String expression, NetObject parseTimeData, NetType propertyType, IServiceProvider serviceProvider) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEvaluateExpression = (JCObject)classInstance.Invoke("EvaluateExpression", expression, parseTimeData == null ? null : parseTimeData.getJCOInstance(), propertyType == null ? null : propertyType.getJCOInstance(), serviceProvider == null ? null : serviceProvider.getJCOInstance());
            return new NetObject(objEvaluateExpression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ExpressionEditor GetExpressionEditor(NetType expressionBuilderType, IServiceProvider serviceProvider) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotImplementedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.NullReferenceException, system.TypeLoadException, system.xml.XmlException, system.io.IOException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetExpressionEditor = (JCObject)classType.Invoke("GetExpressionEditor", expressionBuilderType == null ? null : expressionBuilderType.getJCOInstance(), serviceProvider == null ? null : serviceProvider.getJCOInstance());
            return new ExpressionEditor(objGetExpressionEditor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getExpressionPrefix() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ExpressionPrefix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}