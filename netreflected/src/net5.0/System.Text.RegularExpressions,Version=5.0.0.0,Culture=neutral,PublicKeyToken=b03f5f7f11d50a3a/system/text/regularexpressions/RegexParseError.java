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

package system.text.regularexpressions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Text.RegularExpressions.RegexParseError, System.Text.RegularExpressions, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Text.RegularExpressions.RegexParseError" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Text.RegularExpressions.RegexParseError</a>
 */
public class RegexParseError extends NetObject  {
    /**
     * Fully assembly qualified name: System.Text.RegularExpressions, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Text.RegularExpressions, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Text.RegularExpressions
     */
    public static final String assemblyShortName = "System.Text.RegularExpressions";
    /**
     * Qualified class name: System.Text.RegularExpressions.RegexParseError
     */
    public static final String className = "System.Text.RegularExpressions.RegexParseError";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public RegexParseError(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public RegexParseError() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
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

    final static RegexParseError getFrom(JCEnum object, String value) {
        try {
            return new RegexParseError(object.fromValue(value));
        } catch (JCException e) {
            return new RegexParseError(object);
        }
    }

    // Enum fields section
    
    public static RegexParseError Unknown = getFrom(enumReflected, "Unknown");
    public static RegexParseError AlternationHasTooManyConditions = getFrom(enumReflected, "AlternationHasTooManyConditions");
    public static RegexParseError AlternationHasMalformedCondition = getFrom(enumReflected, "AlternationHasMalformedCondition");
    public static RegexParseError InvalidUnicodePropertyEscape = getFrom(enumReflected, "InvalidUnicodePropertyEscape");
    public static RegexParseError MalformedUnicodePropertyEscape = getFrom(enumReflected, "MalformedUnicodePropertyEscape");
    public static RegexParseError UnrecognizedEscape = getFrom(enumReflected, "UnrecognizedEscape");
    public static RegexParseError UnrecognizedControlCharacter = getFrom(enumReflected, "UnrecognizedControlCharacter");
    public static RegexParseError MissingControlCharacter = getFrom(enumReflected, "MissingControlCharacter");
    public static RegexParseError InsufficientOrInvalidHexDigits = getFrom(enumReflected, "InsufficientOrInvalidHexDigits");
    public static RegexParseError QuantifierOrCaptureGroupOutOfRange = getFrom(enumReflected, "QuantifierOrCaptureGroupOutOfRange");
    public static RegexParseError UndefinedNamedReference = getFrom(enumReflected, "UndefinedNamedReference");
    public static RegexParseError UndefinedNumberedReference = getFrom(enumReflected, "UndefinedNumberedReference");
    public static RegexParseError MalformedNamedReference = getFrom(enumReflected, "MalformedNamedReference");
    public static RegexParseError UnescapedEndingBackslash = getFrom(enumReflected, "UnescapedEndingBackslash");
    public static RegexParseError UnterminatedComment = getFrom(enumReflected, "UnterminatedComment");
    public static RegexParseError InvalidGroupingConstruct = getFrom(enumReflected, "InvalidGroupingConstruct");
    public static RegexParseError AlternationHasNamedCapture = getFrom(enumReflected, "AlternationHasNamedCapture");
    public static RegexParseError AlternationHasComment = getFrom(enumReflected, "AlternationHasComment");
    public static RegexParseError AlternationHasMalformedReference = getFrom(enumReflected, "AlternationHasMalformedReference");
    public static RegexParseError AlternationHasUndefinedReference = getFrom(enumReflected, "AlternationHasUndefinedReference");
    public static RegexParseError CaptureGroupNameInvalid = getFrom(enumReflected, "CaptureGroupNameInvalid");
    public static RegexParseError CaptureGroupOfZero = getFrom(enumReflected, "CaptureGroupOfZero");
    public static RegexParseError UnterminatedBracket = getFrom(enumReflected, "UnterminatedBracket");
    public static RegexParseError ExclusionGroupNotLast = getFrom(enumReflected, "ExclusionGroupNotLast");
    public static RegexParseError ReversedCharacterRange = getFrom(enumReflected, "ReversedCharacterRange");
    public static RegexParseError ShorthandClassInCharacterRange = getFrom(enumReflected, "ShorthandClassInCharacterRange");
    public static RegexParseError InsufficientClosingParentheses = getFrom(enumReflected, "InsufficientClosingParentheses");
    public static RegexParseError ReversedQuantifierRange = getFrom(enumReflected, "ReversedQuantifierRange");
    public static RegexParseError NestedQuantifiersNotParenthesized = getFrom(enumReflected, "NestedQuantifiersNotParenthesized");
    public static RegexParseError QuantifierAfterNothing = getFrom(enumReflected, "QuantifierAfterNothing");
    public static RegexParseError InsufficientOpeningParentheses = getFrom(enumReflected, "InsufficientOpeningParentheses");
    public static RegexParseError UnrecognizedUnicodeProperty = getFrom(enumReflected, "UnrecognizedUnicodeProperty");


    // Flags management section


}