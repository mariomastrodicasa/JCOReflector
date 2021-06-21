/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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
import microsoft.jscript.vsa.IJSVsaItem;
import microsoft.jscript.vsa.IJSVsaItemImplementation;
import microsoft.jscript.vsa.JSVsaItemType;
import microsoft.jscript.IVsaScriptScope;
import microsoft.jscript.IVsaScriptScopeImplementation;


/**
 * The base .NET class managing Microsoft.JScript.IVsaScriptScope, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.IVsaScriptScope" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.IVsaScriptScope</a>
 */
public interface IVsaScriptScope extends IJCOBridgeReflected, IJSVsaItem {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.IVsaScriptScope
     */
    public static final String className = "Microsoft.JScript.IVsaScriptScope";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IVsaScriptScope}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IVsaScriptScope} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IVsaScriptScope ToIVsaScriptScope(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IVsaScriptScopeImplementation(from.getJCOInstance());
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
    
    public int GetItemCount() throws Throwable;

    public IJSVsaItem AddItem(java.lang.String itemName, JSVsaItemType type) throws Throwable;

    public IJSVsaItem CreateDynamicItem(java.lang.String itemName, JSVsaItemType type) throws Throwable;

    public IJSVsaItem GetItem(java.lang.String itemName) throws Throwable;

    public IJSVsaItem GetItemAtIndex(int index) throws Throwable;

    public NetObject GetObject() throws Throwable;


    public void RemoveItem(IJSVsaItem item) throws Throwable;

    public void RemoveItem(java.lang.String itemName) throws Throwable;

    public void RemoveItemAtIndex(int index) throws Throwable;



    
    // Properties section
    
    public IVsaScriptScope getParent() throws Throwable;



    // Instance Events section
    

}