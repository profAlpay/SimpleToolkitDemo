package crc64d431f459a5dbeed1;


public class SimplePopupWindow
	extends android.widget.PopupWindow
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", SimplePopupWindow.class, __md_methods);
	}

	public SimplePopupWindow ()
	{
		super ();
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public SimplePopupWindow (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public SimplePopupWindow (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public SimplePopupWindow (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public SimplePopupWindow (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public SimplePopupWindow (android.view.View p0, int p1, int p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "Android.Views.View, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib:System.Boolean, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public SimplePopupWindow (android.view.View p0, int p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "Android.Views.View, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public SimplePopupWindow (android.view.View p0)
	{
		super (p0);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public SimplePopupWindow (int p0, int p1)
	{
		super (p0, p1);
		if (getClass () == SimplePopupWindow.class) {
			mono.android.TypeManager.Activate ("SimpleToolkit.Core.Platform.SimplePopupWindow, SimpleToolkit.Core", "System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1 });
		}
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
