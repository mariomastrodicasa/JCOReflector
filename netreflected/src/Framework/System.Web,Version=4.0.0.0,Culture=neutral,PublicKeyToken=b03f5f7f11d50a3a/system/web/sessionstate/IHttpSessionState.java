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

package system.web.sessionstate;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.Array;
import system.web.sessionstate.SessionStateMode;
import system.web.HttpCookieMode;
import system.web.HttpStaticObjectsCollection;


/**
 * The base .NET class managing System.Web.SessionState.IHttpSessionState, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface IHttpSessionState extends IJCOBridgeReflected {

    public static IHttpSessionState ToIHttpSessionState(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("System.Web.SessionState.IHttpSessionState, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "System.Web"));
        NetType.AssertCast(classType, from);
        return new IHttpSessionStateImplementation(from.getJCOInstance());
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
    
    public void Abandon() throws Throwable;

    public void Add(java.lang.String name, NetObject value) throws Throwable;

    public void Remove(java.lang.String name) throws Throwable;

    public void RemoveAt(int index) throws Throwable;

    public void Clear() throws Throwable;

    public void RemoveAll() throws Throwable;

    public IEnumerator GetEnumerator() throws Throwable;

    public void CopyTo(Array array, int index) throws Throwable;


    
    // Properties section
    
    public java.lang.String getSessionID() throws Throwable;

    public int getTimeout() throws Throwable;

    public void setTimeout(int Timeout) throws Throwable;

    public boolean getIsNewSession() throws Throwable;

    public SessionStateMode getMode() throws Throwable;

    public boolean getIsCookieless() throws Throwable;

    public HttpCookieMode getCookieMode() throws Throwable;

    public int getLCID() throws Throwable;

    public void setLCID(int LCID) throws Throwable;

    public int getCodePage() throws Throwable;

    public void setCodePage(int CodePage) throws Throwable;

    public HttpStaticObjectsCollection getStaticObjects() throws Throwable;

    public int getCount() throws Throwable;

    public NetObject getSyncRoot() throws Throwable;

    public boolean getIsReadOnly() throws Throwable;

    public boolean getIsSynchronized() throws Throwable;



    // Instance Events section
    

}