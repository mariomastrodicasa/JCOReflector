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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.HandledEventArgs;
import system.windows.forms.DataGridView;
import system.drawing.Graphics;
import system.drawing.Rectangle;
import system.windows.forms.DataGridViewElementStates;
import system.windows.forms.DataGridViewCellStyle;
import system.windows.forms.DataGridViewPaintParts;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewRowPrePaintEventArgs, System.Windows.Forms, Version=5.0.4.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewRowPrePaintEventArgs" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewRowPrePaintEventArgs</a>
 */
public class DataGridViewRowPrePaintEventArgs extends HandledEventArgs  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.4.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.4.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.DataGridViewRowPrePaintEventArgs
     */
    public static final String className = "System.Windows.Forms.DataGridViewRowPrePaintEventArgs";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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

    public DataGridViewRowPrePaintEventArgs(Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataGridViewRowPrePaintEventArgs}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataGridViewRowPrePaintEventArgs} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataGridViewRowPrePaintEventArgs cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataGridViewRowPrePaintEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    public DataGridViewRowPrePaintEventArgs() throws Throwable {
    }

    public DataGridViewRowPrePaintEventArgs(DataGridView dataGridView, Graphics graphics, Rectangle clipBounds, Rectangle rowBounds, int rowIndex, DataGridViewElementStates rowState, java.lang.String errorText, DataGridViewCellStyle inheritedRowStyle, boolean isFirstDisplayedRow, boolean isLastVisibleRow) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dataGridView == null ? null : dataGridView.getJCOInstance(), graphics == null ? null : graphics.getJCOInstance(), clipBounds == null ? null : clipBounds.getJCOInstance(), rowBounds == null ? null : rowBounds.getJCOInstance(), rowIndex, rowState == null ? null : rowState.getJCOInstance(), errorText, inheritedRowStyle == null ? null : inheritedRowStyle.getJCOInstance(), isFirstDisplayedRow, isLastVisibleRow));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void DrawFocus(Rectangle bounds, boolean cellsPaintSelectionBackground) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DrawFocus", bounds == null ? null : bounds.getJCOInstance(), cellsPaintSelectionBackground);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintCells(Rectangle clipBounds, DataGridViewPaintParts paintParts) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PaintCells", clipBounds == null ? null : clipBounds.getJCOInstance(), paintParts == null ? null : paintParts.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintCellsBackground(Rectangle clipBounds, boolean cellsPaintSelectionBackground) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PaintCellsBackground", clipBounds == null ? null : clipBounds.getJCOInstance(), cellsPaintSelectionBackground);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintCellsContent(Rectangle clipBounds) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PaintCellsContent", clipBounds == null ? null : clipBounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintHeader(boolean paintSelectionBackground) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.NotSupportedException, system.componentmodel.Win32Exception, system.InvalidCastException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PaintHeader", paintSelectionBackground);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintHeader(DataGridViewPaintParts paintParts) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PaintHeader", paintParts == null ? null : paintParts.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsFirstDisplayedRow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsFirstDisplayedRow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsFirstDisplayedRow(boolean IsFirstDisplayedRow) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsFirstDisplayedRow", IsFirstDisplayedRow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsLastVisibleRow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsLastVisibleRow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsLastVisibleRow(boolean IsLastVisibleRow) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsLastVisibleRow", IsLastVisibleRow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRowIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("RowIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRowIndex(int RowIndex) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RowIndex", RowIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Graphics getGraphics() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Graphics");
            return new Graphics(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGraphics(Graphics Graphics) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Graphics", Graphics == null ? null : Graphics.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getClipBounds() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClipBounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClipBounds(Rectangle ClipBounds) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClipBounds", ClipBounds == null ? null : ClipBounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getRowBounds() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RowBounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRowBounds(Rectangle RowBounds) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RowBounds", RowBounds == null ? null : RowBounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ErrorText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorText(java.lang.String ErrorText) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ErrorText", ErrorText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewCellStyle getInheritedRowStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InheritedRowStyle");
            return new DataGridViewCellStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInheritedRowStyle(DataGridViewCellStyle InheritedRowStyle) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InheritedRowStyle", InheritedRowStyle == null ? null : InheritedRowStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewElementStates getState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new DataGridViewElementStates(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setState(DataGridViewElementStates State) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("State", State == null ? null : State.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewPaintParts getPaintParts() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PaintParts");
            return new DataGridViewPaintParts(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPaintParts(DataGridViewPaintParts PaintParts) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PaintParts", PaintParts == null ? null : PaintParts.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}