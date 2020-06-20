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

package system.windows.forms.design.behavior;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.design.MenuCommand;
import system.componentmodel.design.CommandID;
import system.windows.forms.design.behavior.Glyph;
import system.EventArgs;
import system.windows.forms.DragEventArgs;
import system.windows.forms.GiveFeedbackEventArgs;
import system.windows.forms.QueryContinueDragEventArgs;
import system.windows.forms.MouseButtons;
import system.drawing.Point;
import system.windows.forms.Cursor;


/**
 * The base .NET class managing System.Windows.Forms.Design.Behavior.Behavior, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Behavior extends NetObject  {
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Design";
    public static final String className = "System.Windows.Forms.Design.Behavior.Behavior";
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

    public Behavior(Object instance) throws Throwable {
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

    public static Behavior cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Behavior(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public MenuCommand FindCommand(CommandID commandId) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindCommand = (JCObject)classInstance.Invoke("FindCommand", commandId == null ? null : commandId.getJCOInstance());
            return new MenuCommand(objFindCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnLoseCapture(Glyph g, EventArgs e) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnLoseCapture", g == null ? null : g.getJCOInstance(), e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMouseEnter(Glyph g) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMouseEnter", g == null ? null : g.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMouseLeave(Glyph g) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMouseLeave", g == null ? null : g.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnDragDrop(Glyph g, DragEventArgs e) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnDragDrop", g == null ? null : g.getJCOInstance(), e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnDragEnter(Glyph g, DragEventArgs e) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnDragEnter", g == null ? null : g.getJCOInstance(), e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnDragLeave(Glyph g, EventArgs e) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnDragLeave", g == null ? null : g.getJCOInstance(), e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnGiveFeedback(Glyph g, GiveFeedbackEventArgs e) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnGiveFeedback", g == null ? null : g.getJCOInstance(), e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnQueryContinueDrag(Glyph g, QueryContinueDragEventArgs e) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnQueryContinueDrag", g == null ? null : g.getJCOInstance(), e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMouseDoubleClick(Glyph g, MouseButtons button, Point mouseLoc) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMouseDoubleClick", g == null ? null : g.getJCOInstance(), button == null ? null : button.getJCOInstance(), mouseLoc == null ? null : mouseLoc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMouseDown(Glyph g, MouseButtons button, Point mouseLoc) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMouseDown", g == null ? null : g.getJCOInstance(), button == null ? null : button.getJCOInstance(), mouseLoc == null ? null : mouseLoc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMouseHover(Glyph g, Point mouseLoc) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMouseHover", g == null ? null : g.getJCOInstance(), mouseLoc == null ? null : mouseLoc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMouseMove(Glyph g, MouseButtons button, Point mouseLoc) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMouseMove", g == null ? null : g.getJCOInstance(), button == null ? null : button.getJCOInstance(), mouseLoc == null ? null : mouseLoc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMouseUp(Glyph g, MouseButtons button) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMouseUp", g == null ? null : g.getJCOInstance(), button == null ? null : button.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnDragOver(Glyph g, DragEventArgs e) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnDragOver", g == null ? null : g.getJCOInstance(), e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Cursor getCursor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Cursor");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDisableAllCommands() throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DisableAllCommands");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}