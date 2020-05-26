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

package system.activities.presentation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.presentation.WorkflowViewElement;
import system.windows.UIElement;
import system.windows.DragDropEffects;
import system.windows.Point;
import system.windows.DependencyObject;
import system.windows.DragEventArgs;
import system.activities.presentation.EditingContext;
import system.activities.presentation.model.ModelItem;
import system.windows.DataObject;


/**
 * The base .NET class managing System.Activities.Presentation.DragDropHelper, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DragDropHelper extends NetObject  {
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities.Presentation";
    public static final String className = "System.Activities.Presentation.DragDropHelper";
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

    public DragDropHelper(Object instance) throws Throwable {
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

    public static DragDropHelper castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DragDropHelper(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static void SetCompositeView(WorkflowViewElement workflowViewElement, UIElement dragSource) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classType.Invoke("SetCompositeView", (Object)workflowViewElement.getJCOInstance(), (Object)dragSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UIElement GetCompositeView(WorkflowViewElement workflowViewElement) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            JCObject objGetCompositeView = (JCObject)classType.Invoke("GetCompositeView", (Object)workflowViewElement.getJCOInstance());
            return new UIElement(objGetCompositeView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DragDropEffects DoDragMove(WorkflowViewElement draggedViewElement, Point referencePoint) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.RankException, system.OutOfMemoryException, system.threading.ThreadStateException, system.SystemException {
        try {
            JCObject objDoDragMove = (JCObject)classType.Invoke("DoDragMove", (Object)draggedViewElement.getJCOInstance(), (Object)referencePoint.getJCOInstance());
            return new DragDropEffects(objDoDragMove);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetDroppedObject(DependencyObject dropTarget, DragEventArgs e, EditingContext context) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.OverflowException, system.io.IOException, system.NotImplementedException, system.RankException, system.componentmodel.Win32Exception, system.collections.generic.KeyNotFoundException, system.FormatException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException {
        try {
            JCObject objGetDroppedObject = (JCObject)classType.Invoke("GetDroppedObject", (Object)dropTarget.getJCOInstance(), (Object)e.getJCOInstance(), (Object)context.getJCOInstance());
            return new NetObject(objGetDroppedObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelItem GetDraggedModelItem(DragEventArgs e) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetDraggedModelItem = (JCObject)classType.Invoke("GetDraggedModelItem", (Object)e.getJCOInstance());
            return new ModelItem(objGetDraggedModelItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Point GetDragDropAnchorPoint(DragEventArgs e) throws Throwable {
        try {
            JCObject objGetDragDropAnchorPoint = (JCObject)classType.Invoke("GetDragDropAnchorPoint", (Object)e.getJCOInstance());
            return new Point(objGetDragDropAnchorPoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetDragDropCompletedEffects(DragEventArgs e, DragDropEffects completedEffects) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException {
        try {
            classType.Invoke("SetDragDropCompletedEffects", (Object)e.getJCOInstance(), (Object)completedEffects.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DragDropEffects GetDragDropCompletedEffects(DataObject data) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetDragDropCompletedEffects = (JCObject)classType.Invoke("GetDragDropCompletedEffects", (Object)data.getJCOInstance());
            return new DragDropEffects(objGetDragDropCompletedEffects);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}