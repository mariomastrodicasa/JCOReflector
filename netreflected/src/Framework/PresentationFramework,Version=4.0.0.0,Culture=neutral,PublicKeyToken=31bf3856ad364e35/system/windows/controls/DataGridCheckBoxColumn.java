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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows.controls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.FrameworkElement;
import system.windows.controls.DataGridRow;
import system.windows.DependencyProperty;
import system.windows.DependencyPropertyKey;
import system.windows.LocalValueEnumerator;
import system.windows.data.BindingBase;
import system.windows.Style;
import system.windows.DataTemplate;
import system.windows.controls.DataTemplateSelector;
import system.windows.controls.DataGridLength;
import system.windows.Visibility;
import system.windows.DependencyObjectType;
import system.windows.threading.Dispatcher;


/**
 * The base .NET class managing System.Windows.Controls.DataGridCheckBoxColumn, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DataGridCheckBoxColumn extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Controls.DataGridCheckBoxColumn";
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

    public DataGridCheckBoxColumn(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static DataGridCheckBoxColumn castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataGridCheckBoxColumn(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataGridCheckBoxColumn() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public FrameworkElement GetCellContent(NetObject dataItem) throws Throwable, system.ArgumentNullException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            JCObject objGetCellContent = (JCObject)classInstance.Invoke("GetCellContent", (Object)dataItem.getJCOInstance());
            return new FrameworkElement(objGetCellContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject OnCopyingCellClipboardContent(NetObject item) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException {
        try {
            JCObject objOnCopyingCellClipboardContent = (JCObject)classInstance.Invoke("OnCopyingCellClipboardContent", (Object)item.getJCOInstance());
            return new NetObject(objOnCopyingCellClipboardContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnPastingCellClipboardContent(NetObject item, NetObject cellContent) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.componentmodel.Win32Exception, system.InvalidCastException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("OnPastingCellClipboardContent", (Object)item.getJCOInstance(), (Object)cellContent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FrameworkElement GetCellContent(DataGridRow dataGridRow) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException {
        try {
            JCObject objGetCellContent = (JCObject)classInstance.Invoke("GetCellContent", (Object)dataGridRow.getJCOInstance());
            return new FrameworkElement(objGetCellContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.io.IOException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)dp.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(DependencyProperty dp, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValue", (Object)dp.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCurrentValue(DependencyProperty dp, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetCurrentValue", (Object)dp.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(DependencyPropertyKey key, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValue", (Object)key.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("ClearValue", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearValue(DependencyPropertyKey key) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("ClearValue", (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CoerceValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("CoerceValue", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InvalidateProperty(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("InvalidateProperty", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadLocalValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objReadLocalValue = (JCObject)classInstance.Invoke("ReadLocalValue", (Object)dp.getJCOInstance());
            return new NetObject(objReadLocalValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalValueEnumerator GetLocalValueEnumerator() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetLocalValueEnumerator = (JCObject)classInstance.Invoke("GetLocalValueEnumerator");
            return new LocalValueEnumerator(objGetLocalValueEnumerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckAccess() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CheckAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("VerifyAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsThreeState() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsThreeState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsThreeState(boolean IsThreeState) throws Throwable {
        try {
            classInstance.Set("IsThreeState", IsThreeState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingBase getBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Binding");
            return new BindingBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBinding(BindingBase Binding) throws Throwable {
        try {
            classInstance.Set("Binding", (Object)Binding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getElementStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ElementStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setElementStyle(Style ElementStyle) throws Throwable {
        try {
            classInstance.Set("ElementStyle", (Object)ElementStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getEditingElementStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EditingElementStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEditingElementStyle(Style EditingElementStyle) throws Throwable {
        try {
            classInstance.Set("EditingElementStyle", (Object)EditingElementStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingBase getClipboardContentBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClipboardContentBinding");
            return new BindingBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClipboardContentBinding(BindingBase ClipboardContentBinding) throws Throwable {
        try {
            classInstance.Set("ClipboardContentBinding", (Object)ClipboardContentBinding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getHeader() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Header");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeader(NetObject Header) throws Throwable {
        try {
            classInstance.Set("Header", (Object)Header.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getHeaderStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HeaderStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderStyle(Style HeaderStyle) throws Throwable {
        try {
            classInstance.Set("HeaderStyle", (Object)HeaderStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHeaderStringFormat() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HeaderStringFormat");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderStringFormat(java.lang.String HeaderStringFormat) throws Throwable {
        try {
            classInstance.Set("HeaderStringFormat", (Object)HeaderStringFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTemplate getHeaderTemplate() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HeaderTemplate");
            return new DataTemplate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderTemplate(DataTemplate HeaderTemplate) throws Throwable {
        try {
            classInstance.Set("HeaderTemplate", (Object)HeaderTemplate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTemplateSelector getHeaderTemplateSelector() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HeaderTemplateSelector");
            return new DataTemplateSelector(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderTemplateSelector(DataTemplateSelector HeaderTemplateSelector) throws Throwable {
        try {
            classInstance.Set("HeaderTemplateSelector", (Object)HeaderTemplateSelector.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getCellStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CellStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCellStyle(Style CellStyle) throws Throwable {
        try {
            classInstance.Set("CellStyle", (Object)CellStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsReadOnly(boolean IsReadOnly) throws Throwable {
        try {
            classInstance.Set("IsReadOnly", IsReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridLength getWidth() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Width");
            return new DataGridLength(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWidth(DataGridLength Width) throws Throwable {
        try {
            classInstance.Set("Width", (Object)Width.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getMinWidth() throws Throwable {
        try {
            return (double)classInstance.Get("MinWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinWidth(double MinWidth) throws Throwable {
        try {
            classInstance.Set("MinWidth", MinWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getMaxWidth() throws Throwable {
        try {
            return (double)classInstance.Get("MaxWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxWidth(double MaxWidth) throws Throwable {
        try {
            classInstance.Set("MaxWidth", MaxWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getActualWidth() throws Throwable {
        try {
            return (double)classInstance.Get("ActualWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDisplayIndex() throws Throwable {
        try {
            return (int)classInstance.Get("DisplayIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayIndex(int DisplayIndex) throws Throwable {
        try {
            classInstance.Set("DisplayIndex", DisplayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSortMemberPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SortMemberPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSortMemberPath(java.lang.String SortMemberPath) throws Throwable {
        try {
            classInstance.Set("SortMemberPath", (Object)SortMemberPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanUserSort() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanUserSort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanUserSort(boolean CanUserSort) throws Throwable {
        try {
            classInstance.Set("CanUserSort", CanUserSort);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAutoGenerated() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAutoGenerated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsAutoGenerated(boolean IsAutoGenerated) throws Throwable {
        try {
            classInstance.Set("IsAutoGenerated", IsAutoGenerated);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFrozen() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFrozen");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsFrozen(boolean IsFrozen) throws Throwable {
        try {
            classInstance.Set("IsFrozen", IsFrozen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanUserReorder() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanUserReorder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanUserReorder(boolean CanUserReorder) throws Throwable {
        try {
            classInstance.Set("CanUserReorder", CanUserReorder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getDragIndicatorStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DragIndicatorStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDragIndicatorStyle(Style DragIndicatorStyle) throws Throwable {
        try {
            classInstance.Set("DragIndicatorStyle", (Object)DragIndicatorStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanUserResize() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanUserResize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanUserResize(boolean CanUserResize) throws Throwable {
        try {
            classInstance.Set("CanUserResize", CanUserResize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Visibility getVisibility() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Visibility");
            return new Visibility(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisibility(Visibility Visibility) throws Throwable {
        try {
            classInstance.Set("Visibility", (Object)Visibility.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObjectType getDependencyObjectType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DependencyObjectType");
            return new DependencyObjectType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSealed() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSealed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Dispatcher getDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Style getDefaultElementStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DefaultElementStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Style getDefaultEditingElementStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DefaultEditingElementStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    

}