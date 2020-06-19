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

package system.windows.automation.provider;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.automation.provider.ITextRangeProvider;
import system.windows.automation.provider.ITextRangeProviderImplementation;
import system.windows.automation.text.TextPatternRangeEndpoint;
import system.windows.automation.text.TextUnit;
import system.windows.automation.provider.IRawElementProviderSimple;
import system.windows.automation.provider.IRawElementProviderSimpleImplementation;


/**
 * The base .NET class managing System.Windows.Automation.Provider.ITextRangeProvider, UIAutomationProvider, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ITextRangeProviderImplementation extends NetObject implements ITextRangeProvider {
    public static final String assemblyFullName = "UIAutomationProvider, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "UIAutomationProvider";
    public static final String className = "System.Windows.Automation.Provider.ITextRangeProvider";
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

    public ITextRangeProviderImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static ITextRangeProvider ToITextRangeProvider(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ITextRangeProviderImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public ITextRangeProvider Clone() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new ITextRangeProviderImplementation(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Compare(ITextRangeProvider range) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Compare", range == null ? null : range.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareEndpoints(TextPatternRangeEndpoint endpoint, ITextRangeProvider targetRange, TextPatternRangeEndpoint targetEndpoint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareEndpoints", endpoint == null ? null : endpoint.getJCOInstance(), targetRange == null ? null : targetRange.getJCOInstance(), targetEndpoint == null ? null : targetEndpoint.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ExpandToEnclosingUnit(TextUnit unit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ExpandToEnclosingUnit", unit == null ? null : unit.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITextRangeProvider FindAttribute(int attribute, NetObject value, boolean backward) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAttribute = (JCObject)classInstance.Invoke("FindAttribute", attribute, value == null ? null : value.getJCOInstance(), backward);
            return new ITextRangeProviderImplementation(objFindAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITextRangeProvider FindText(java.lang.String text, boolean backward, boolean ignoreCase) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindText = (JCObject)classInstance.Invoke("FindText", text, backward, ignoreCase);
            return new ITextRangeProviderImplementation(objFindText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetAttributeValue(int attribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAttributeValue = (JCObject)classInstance.Invoke("GetAttributeValue", attribute);
            return new NetObject(objGetAttributeValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double[] GetBoundingRectangles() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetBoundingRectangles");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            double[] resultingArray = new double[resultingArrayList.size()];
            for(int indexGetBoundingRectangles = 0; indexGetBoundingRectangles < resultingArrayList.size(); indexGetBoundingRectangles++ ) {
				resultingArray[indexGetBoundingRectangles] = (double)resultingArrayList.get(indexGetBoundingRectangles);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRawElementProviderSimple GetEnclosingElement() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEnclosingElement = (JCObject)classInstance.Invoke("GetEnclosingElement");
            return new IRawElementProviderSimpleImplementation(objGetEnclosingElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetText(int maxLength) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetText", maxLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Move(TextUnit unit, int count) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("Move", unit == null ? null : unit.getJCOInstance(), count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int MoveEndpointByUnit(TextPatternRangeEndpoint endpoint, TextUnit unit, int count) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("MoveEndpointByUnit", endpoint == null ? null : endpoint.getJCOInstance(), unit == null ? null : unit.getJCOInstance(), count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveEndpointByRange(TextPatternRangeEndpoint endpoint, ITextRangeProvider targetRange, TextPatternRangeEndpoint targetEndpoint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveEndpointByRange", endpoint == null ? null : endpoint.getJCOInstance(), targetRange == null ? null : targetRange.getJCOInstance(), targetEndpoint == null ? null : targetEndpoint.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Select() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Select");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddToSelection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddToSelection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveFromSelection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveFromSelection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ScrollIntoView(boolean alignToTop) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ScrollIntoView", alignToTop);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRawElementProviderSimple[] GetChildren() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<IRawElementProviderSimple> resultingArrayList = new ArrayList<IRawElementProviderSimple>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetChildren");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new IRawElementProviderSimpleImplementation(resultingObject));
            }
            IRawElementProviderSimple[] resultingArray = new IRawElementProviderSimple[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}