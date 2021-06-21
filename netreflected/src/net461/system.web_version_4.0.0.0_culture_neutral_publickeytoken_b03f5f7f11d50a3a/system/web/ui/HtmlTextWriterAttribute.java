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

package system.web.ui;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Web.UI.HtmlTextWriterAttribute, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.HtmlTextWriterAttribute" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.HtmlTextWriterAttribute</a>
 */
public class HtmlTextWriterAttribute extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.UI.HtmlTextWriterAttribute
     */
    public static final String className = "System.Web.UI.HtmlTextWriterAttribute";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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

    public HtmlTextWriterAttribute(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public HtmlTextWriterAttribute() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    public JCType getJCOType() {
        return classType;
    }

    final static HtmlTextWriterAttribute getFrom(JCEnum object, String value) {
        try {
            return new HtmlTextWriterAttribute(object.fromValue(value));
        } catch (JCException e) {
            return new HtmlTextWriterAttribute(object);
        }
    }

    // Enum fields section
    
    public static HtmlTextWriterAttribute Accesskey = getFrom(enumReflected, "Accesskey");
    public static HtmlTextWriterAttribute Align = getFrom(enumReflected, "Align");
    public static HtmlTextWriterAttribute Alt = getFrom(enumReflected, "Alt");
    public static HtmlTextWriterAttribute Background = getFrom(enumReflected, "Background");
    public static HtmlTextWriterAttribute Bgcolor = getFrom(enumReflected, "Bgcolor");
    public static HtmlTextWriterAttribute Border = getFrom(enumReflected, "Border");
    public static HtmlTextWriterAttribute Bordercolor = getFrom(enumReflected, "Bordercolor");
    public static HtmlTextWriterAttribute Cellpadding = getFrom(enumReflected, "Cellpadding");
    public static HtmlTextWriterAttribute Cellspacing = getFrom(enumReflected, "Cellspacing");
    public static HtmlTextWriterAttribute Checked = getFrom(enumReflected, "Checked");
    public static HtmlTextWriterAttribute Class = getFrom(enumReflected, "Class");
    public static HtmlTextWriterAttribute Cols = getFrom(enumReflected, "Cols");
    public static HtmlTextWriterAttribute Colspan = getFrom(enumReflected, "Colspan");
    public static HtmlTextWriterAttribute Disabled = getFrom(enumReflected, "Disabled");
    public static HtmlTextWriterAttribute For = getFrom(enumReflected, "For");
    public static HtmlTextWriterAttribute Height = getFrom(enumReflected, "Height");
    public static HtmlTextWriterAttribute Href = getFrom(enumReflected, "Href");
    public static HtmlTextWriterAttribute Id = getFrom(enumReflected, "Id");
    public static HtmlTextWriterAttribute Maxlength = getFrom(enumReflected, "Maxlength");
    public static HtmlTextWriterAttribute Multiple = getFrom(enumReflected, "Multiple");
    public static HtmlTextWriterAttribute Name = getFrom(enumReflected, "Name");
    public static HtmlTextWriterAttribute Nowrap = getFrom(enumReflected, "Nowrap");
    public static HtmlTextWriterAttribute Onchange = getFrom(enumReflected, "Onchange");
    public static HtmlTextWriterAttribute Onclick = getFrom(enumReflected, "Onclick");
    public static HtmlTextWriterAttribute ReadOnly = getFrom(enumReflected, "ReadOnly");
    public static HtmlTextWriterAttribute Rows = getFrom(enumReflected, "Rows");
    public static HtmlTextWriterAttribute Rowspan = getFrom(enumReflected, "Rowspan");
    public static HtmlTextWriterAttribute Rules = getFrom(enumReflected, "Rules");
    public static HtmlTextWriterAttribute Selected = getFrom(enumReflected, "Selected");
    public static HtmlTextWriterAttribute Size = getFrom(enumReflected, "Size");
    public static HtmlTextWriterAttribute Src = getFrom(enumReflected, "Src");
    public static HtmlTextWriterAttribute Style = getFrom(enumReflected, "Style");
    public static HtmlTextWriterAttribute Tabindex = getFrom(enumReflected, "Tabindex");
    public static HtmlTextWriterAttribute Target = getFrom(enumReflected, "Target");
    public static HtmlTextWriterAttribute Title = getFrom(enumReflected, "Title");
    public static HtmlTextWriterAttribute Type = getFrom(enumReflected, "Type");
    public static HtmlTextWriterAttribute Valign = getFrom(enumReflected, "Valign");
    public static HtmlTextWriterAttribute Value = getFrom(enumReflected, "Value");
    public static HtmlTextWriterAttribute Width = getFrom(enumReflected, "Width");
    public static HtmlTextWriterAttribute Wrap = getFrom(enumReflected, "Wrap");
    public static HtmlTextWriterAttribute Abbr = getFrom(enumReflected, "Abbr");
    public static HtmlTextWriterAttribute AutoComplete = getFrom(enumReflected, "AutoComplete");
    public static HtmlTextWriterAttribute Axis = getFrom(enumReflected, "Axis");
    public static HtmlTextWriterAttribute Content = getFrom(enumReflected, "Content");
    public static HtmlTextWriterAttribute Coords = getFrom(enumReflected, "Coords");
    public static HtmlTextWriterAttribute DesignerRegion = getFrom(enumReflected, "DesignerRegion");
    public static HtmlTextWriterAttribute Dir = getFrom(enumReflected, "Dir");
    public static HtmlTextWriterAttribute Headers = getFrom(enumReflected, "Headers");
    public static HtmlTextWriterAttribute Longdesc = getFrom(enumReflected, "Longdesc");
    public static HtmlTextWriterAttribute Rel = getFrom(enumReflected, "Rel");
    public static HtmlTextWriterAttribute Scope = getFrom(enumReflected, "Scope");
    public static HtmlTextWriterAttribute Shape = getFrom(enumReflected, "Shape");
    public static HtmlTextWriterAttribute Usemap = getFrom(enumReflected, "Usemap");
    public static HtmlTextWriterAttribute VCardName = getFrom(enumReflected, "VCardName");


    // Flags management section


}