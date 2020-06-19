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
 *      This code was generated from a template using JCOReflector version 1.1.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.build.framework;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import microsoft.build.framework.ITaskItem;
import microsoft.build.framework.ITaskItemImplementation;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;


/**
 * The base .NET class managing Microsoft.Build.Framework.ITaskItem2, Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface ITaskItem2 extends IJCOBridgeReflected {

    public static ITaskItem2 ToITaskItem2(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("Microsoft.Build.Framework.ITaskItem2, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "Microsoft.Build.Framework"));
        NetType.AssertCast(classType, from);
        return new ITaskItem2Implementation(from.getJCOInstance());
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
    
    public java.lang.String GetMetadataValueEscaped(java.lang.String metadataName) throws Throwable;

    public void SetMetadataValueLiteral(java.lang.String metadataName, java.lang.String metadataValue) throws Throwable;

    public IDictionary CloneCustomMetadataEscaped() throws Throwable;

    public java.lang.String GetMetadata(java.lang.String metadataName) throws Throwable;

    public void SetMetadata(java.lang.String metadataName, java.lang.String metadataValue) throws Throwable;

    public void RemoveMetadata(java.lang.String metadataName) throws Throwable;

    public void CopyMetadataTo(ITaskItem destinationItem) throws Throwable;

    public IDictionary CloneCustomMetadata() throws Throwable;


    
    // Properties section
    
    public java.lang.String getEvaluatedIncludeEscaped() throws Throwable;

    public void setEvaluatedIncludeEscaped(java.lang.String EvaluatedIncludeEscaped) throws Throwable;

    public java.lang.String getItemSpec() throws Throwable;

    public void setItemSpec(java.lang.String ItemSpec) throws Throwable;

    public ICollection getMetadataNames() throws Throwable;

    public int getMetadataCount() throws Throwable;



    // Instance Events section
    

}