#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;


/**
 * Base class for all pages. Provides markup for XHTML 1.0 Strict doctype.
 * <p>
 * Also exposes a <code>_body</code> variable to subclasses that can be used
 * to add <code>id</code> or <code>class</code> attributes to the
 * &lt;body&gt; element. For example, to add an <code>id</code>, do this:
 * <pre>
 * _body.setMarkupId("myId");
 * </pre>
 * To add a CSS class (using fiftyfive.wicket.util.Shortcuts.cssClass):
 * <pre>
 * _body.add(cssClass("myClass"));
 * </pre>
 */
public abstract class BasePage extends WebPage
{
    protected final WebMarkupContainer _body;
    
    public BasePage(PageParameters params)
    {
        super(params);
        add(_body = new WebMarkupContainer("body") {
            public boolean isTransparentResolver()
            {
                return true;
            }
        });
        _body.setOutputMarkupId(true);
    }
    
    public ${app_classname} get${app_classname}()
    {
        return (${app_classname}) getApplication();
    }
    
    public ${session_classname} get${session_classname}()
    {
        return (${session_classname}) super.getSession();
    }
}