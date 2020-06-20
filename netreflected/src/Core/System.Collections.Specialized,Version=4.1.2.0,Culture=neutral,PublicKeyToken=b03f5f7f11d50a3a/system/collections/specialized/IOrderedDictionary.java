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

package system.collections.specialized;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.Array;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;


/**
 * The base .NET class managing System.Collections.Specialized.IOrderedDictionary, System.Collections.Specialized, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface IOrderedDictionary extends IJCOBridgeReflected {

    public static IOrderedDictionary ToIOrderedDictionary(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Collections.Specialized, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("System.Collections.Specialized.IOrderedDictionary, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.Collections.Specialized, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "System.Collections.Specialized"));
        NetType.AssertCast(classType, from);
        return new IOrderedDictionaryImplementation(from.getJCOInstance());
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
    
    public void Insert(int index, NetObject key, NetObject value) throws Throwable;

    public void RemoveAt(int index) throws Throwable;

    public boolean Contains(NetObject key) throws Throwable;

    public void Add(NetObject key, NetObject value) throws Throwable;

    public void Clear() throws Throwable;

    public void Remove(NetObject key) throws Throwable;

    public void CopyTo(Array array, int index) throws Throwable;


    
    // Properties section
    
    public ICollection getKeys() throws Throwable;

    public ICollection getValues() throws Throwable;

    public boolean getIsReadOnly() throws Throwable;

    public boolean getIsFixedSize() throws Throwable;

    public int getCount() throws Throwable;

    public NetObject getSyncRoot() throws Throwable;

    public boolean getIsSynchronized() throws Throwable;



    // Instance Events section
    

}