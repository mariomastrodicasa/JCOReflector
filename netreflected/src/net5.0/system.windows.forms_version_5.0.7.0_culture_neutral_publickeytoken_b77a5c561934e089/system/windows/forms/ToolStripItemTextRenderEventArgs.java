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
import system.windows.forms.ToolStripItemRenderEventArgs;
import system.drawing.Graphics;
import system.windows.forms.ToolStripItem;
import system.drawing.Rectangle;
import system.drawing.Color;
import system.drawing.Font;
import system.drawing.ContentAlignment;
import system.windows.forms.TextFormatFlags;
import system.windows.forms.ToolStripTextDirection;


/**
 * The base .NET class managing System.Windows.Forms.ToolStripItemTextRenderEventArgs, System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripItemTextRenderEventArgs" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripItemTextRenderEventArgs</a>
 */
public class ToolStripItemTextRenderEventArgs extends ToolStripItemRenderEventArgs  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ToolStripItemTextRenderEventArgs
     */
    public static final String className = "System.Windows.Forms.ToolStripItemTextRenderEventArgs";
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

    public ToolStripItemTextRenderEventArgs(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ToolStripItemTextRenderEventArgs}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ToolStripItemTextRenderEventArgs} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ToolStripItemTextRenderEventArgs cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ToolStripItemTextRenderEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    public ToolStripItemTextRenderEventArgs() throws Throwable {
    }

    public ToolStripItemTextRenderEventArgs(Graphics g, ToolStripItem item, java.lang.String text, Rectangle textRectangle, Color textColor, Font textFont, ContentAlignment textAlign) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(g == null ? null : g.getJCOInstance(), item == null ? null : item.getJCOInstance(), text, textRectangle == null ? null : textRectangle.getJCOInstance(), textColor == null ? null : textColor.getJCOInstance(), textFont == null ? null : textFont.getJCOInstance(), textAlign == null ? null : textAlign.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripItemTextRenderEventArgs(Graphics g, ToolStripItem item, java.lang.String text, Rectangle textRectangle, Color textColor, Font textFont, TextFormatFlags format) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(g == null ? null : g.getJCOInstance(), item == null ? null : item.getJCOInstance(), text, textRectangle == null ? null : textRectangle.getJCOInstance(), textColor == null ? null : textColor.getJCOInstance(), textFont == null ? null : textFont.getJCOInstance(), format == null ? null : format.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    

    
    // Properties section
    
    public Color getTextColor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TextColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTextColor(Color TextColor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TextColor", TextColor == null ? null : TextColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getTextFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TextFont");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTextFont(Font TextFont) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TextFont", TextFont == null ? null : TextFont.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getTextRectangle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TextRectangle");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTextRectangle(Rectangle TextRectangle) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TextRectangle", TextRectangle == null ? null : TextRectangle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Text");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setText(java.lang.String Text) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Text", Text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFormatFlags getTextFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TextFormat");
            return new TextFormatFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTextFormat(TextFormatFlags TextFormat) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TextFormat", TextFormat == null ? null : TextFormat.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripTextDirection getTextDirection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TextDirection");
            return new ToolStripTextDirection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTextDirection(ToolStripTextDirection TextDirection) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TextDirection", TextDirection == null ? null : TextDirection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}