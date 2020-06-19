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

package system.web.ui.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.web.ui.webcontrols.DataKeyArray;
import system.web.ui.webcontrols.DataKey;
import system.web.ui.IDataSource;
import system.web.ui.IDataSourceImplementation;


/**
 * The base .NET class managing System.Web.UI.WebControls.IDataBoundListControl, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface IDataBoundListControl extends IJCOBridgeReflected {

    public static IDataBoundListControl ToIDataBoundListControl(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("System.Web.UI.WebControls.IDataBoundListControl, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "System.Web"));
        NetType.AssertCast(classType, from);
        return new IDataBoundListControlImplementation(from.getJCOInstance());
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
    

    
    // Properties section
    
    public DataKeyArray getDataKeys() throws Throwable;

    public DataKey getSelectedDataKey() throws Throwable;

    public int getSelectedIndex() throws Throwable;

    public void setSelectedIndex(int SelectedIndex) throws Throwable;

    public java.lang.String[] getClientIDRowSuffix() throws Throwable;

    public void setClientIDRowSuffix(java.lang.String[] ClientIDRowSuffix) throws Throwable;

    public boolean getEnablePersistedSelection() throws Throwable;

    public void setEnablePersistedSelection(boolean EnablePersistedSelection) throws Throwable;

    public java.lang.String getDataSourceID() throws Throwable;

    public void setDataSourceID(java.lang.String DataSourceID) throws Throwable;

    public IDataSource getDataSourceObject() throws Throwable;

    public NetObject getDataSource() throws Throwable;

    public void setDataSource(NetObject DataSource) throws Throwable;

    public java.lang.String[] getDataKeyNames() throws Throwable;

    public void setDataKeyNames(java.lang.String[] DataKeyNames) throws Throwable;

    public java.lang.String getDataMember() throws Throwable;

    public void setDataMember(java.lang.String DataMember) throws Throwable;



    // Instance Events section
    

}