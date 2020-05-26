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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.design.WorkflowTheme;
import system.workflow.componentmodel.design.AmbientProperty;
import system.drawing.Brush;
import system.drawing.Rectangle;
import system.drawing.Color;
import system.workflow.componentmodel.design.DesignerContentAlignment;
import system.workflow.componentmodel.design.LineAnchor;
import system.drawing.Size;
import system.drawing.Image;
import system.drawing.drawing2d.DashStyle;
import system.drawing.drawing2d.LinearGradientMode;
import system.drawing.Pen;
import system.workflow.componentmodel.design.DesignerGeometry;
import system.drawing.Font;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.ActivityPreviewDesignerTheme, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ActivityPreviewDesignerTheme extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.Design.ActivityPreviewDesignerTheme";
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

    public ActivityPreviewDesignerTheme(Object instance) throws Throwable {
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

    public static ActivityPreviewDesignerTheme castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ActivityPreviewDesignerTheme(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ActivityPreviewDesignerTheme(WorkflowTheme theme) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)theme.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Initialize() throws Throwable, system.ArgumentNullException, system.collections.generic.KeyNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.FormatException, system.MulticastNotSupportedException, system.NullReferenceException, system.InvalidCastException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            classInstance.Invoke("Initialize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnAmbientPropertyChanged(AmbientProperty ambientProperty) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("OnAmbientPropertyChanged", (Object)ambientProperty.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush GetExpandButtonBackgroundBrush(Rectangle rectangle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.runtime.interopservices.ExternalException {
        try {
            JCObject objGetExpandButtonBackgroundBrush = (JCObject)classInstance.Invoke("GetExpandButtonBackgroundBrush", (Object)rectangle.getJCOInstance());
            return new Brush(objGetExpandButtonBackgroundBrush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush GetBackgroundBrush(Rectangle rectangle) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objGetBackgroundBrush = (JCObject)classInstance.Invoke("GetBackgroundBrush", (Object)rectangle.getJCOInstance());
            return new Brush(objGetBackgroundBrush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Color getPreviewForeColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PreviewForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreviewForeColor(Color PreviewForeColor) throws Throwable {
        try {
            classInstance.Set("PreviewForeColor", (Object)PreviewForeColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getPreviewBackColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PreviewBackColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreviewBackColor(Color PreviewBackColor) throws Throwable {
        try {
            classInstance.Set("PreviewBackColor", (Object)PreviewBackColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getPreviewBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PreviewBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreviewBorderColor(Color PreviewBorderColor) throws Throwable {
        try {
            classInstance.Set("PreviewBorderColor", (Object)PreviewBorderColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWatermarkImagePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("WatermarkImagePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWatermarkImagePath(java.lang.String WatermarkImagePath) throws Throwable {
        try {
            classInstance.Set("WatermarkImagePath", (Object)WatermarkImagePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerContentAlignment getWatermarkAlignment() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WatermarkAlignment");
            return new DesignerContentAlignment(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWatermarkAlignment(DesignerContentAlignment WatermarkAlignment) throws Throwable {
        try {
            classInstance.Set("WatermarkAlignment", (Object)WatermarkAlignment.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowDropShadow() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowDropShadow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowDropShadow(boolean ShowDropShadow) throws Throwable {
        try {
            classInstance.Set("ShowDropShadow", ShowDropShadow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LineAnchor getConnectorStartCap() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectorStartCap");
            return new LineAnchor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnectorStartCap(LineAnchor ConnectorStartCap) throws Throwable {
        try {
            classInstance.Set("ConnectorStartCap", (Object)ConnectorStartCap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LineAnchor getConnectorEndCap() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectorEndCap");
            return new LineAnchor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnectorEndCap(LineAnchor ConnectorEndCap) throws Throwable {
        try {
            classInstance.Set("ConnectorEndCap", (Object)ConnectorEndCap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getConnectorSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectorSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getExpandButtonSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ExpandButtonSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Image getWatermarkImage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WatermarkImage");
            return new Image(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDesignerImagePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DesignerImagePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDesignerImagePath(java.lang.String DesignerImagePath) throws Throwable {
        try {
            classInstance.Set("DesignerImagePath", (Object)DesignerImagePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getForeColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setForeColor(Color ForeColor) throws Throwable {
        try {
            classInstance.Set("ForeColor", (Object)ForeColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBorderColor(Color BorderColor) throws Throwable {
        try {
            classInstance.Set("BorderColor", (Object)BorderColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DashStyle getBorderStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BorderStyle");
            return new DashStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBorderStyle(DashStyle BorderStyle) throws Throwable {
        try {
            classInstance.Set("BorderStyle", (Object)BorderStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBackColorStart() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BackColorStart");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBackColorStart(Color BackColorStart) throws Throwable {
        try {
            classInstance.Set("BackColorStart", (Object)BackColorStart.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBackColorEnd() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BackColorEnd");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBackColorEnd(Color BackColorEnd) throws Throwable {
        try {
            classInstance.Set("BackColorEnd", (Object)BackColorEnd.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LinearGradientMode getBackgroundStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BackgroundStyle");
            return new LinearGradientMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBackgroundStyle(LinearGradientMode BackgroundStyle) throws Throwable {
        try {
            classInstance.Set("BackgroundStyle", (Object)BackgroundStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getForegroundPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForegroundPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getForegroundBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForegroundBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getBorderPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BorderPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Size");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerGeometry getDesignerGeometry() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DesignerGeometry");
            return new DesignerGeometry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Image getDesignerImage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DesignerImage");
            return new Image(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getImageSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ImageSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getFont() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Font");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getBoldFont() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BoldFont");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBorderWidth() throws Throwable {
        try {
            return (int)classInstance.Get("BorderWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDesignerType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DesignerType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDesignerType(NetType DesignerType) throws Throwable {
        try {
            classInstance.Set("DesignerType", (Object)DesignerType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplyTo() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplyTo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplyTo(java.lang.String ApplyTo) throws Throwable {
        try {
            classInstance.Set("ApplyTo", (Object)ApplyTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable {
        try {
            classInstance.Set("ReadOnly", ReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}