## Locators
* If there is space in classname, there are two class names. Use one of them.

* Verify locators in browser console
    - CSS: `$('')` -> `$('p.error')`
    - Xpath: `$x('')` -> `$x('//input[@placeholder="Name"]')`


### CSS Seelctor

* Syntax using class name: `tagname.classname`
* Synttax using id: `tagname#id`
* Generic Syntax: `tagname[attribute='value']`
* Syntax for *child* attributes: `tagname[attribute='value']:nth-child(index)`
* path: `parenttagname childtag` -> `form h2`
* Regular expression based match for partial string`input[type*="pass"]`. In this statement `*` signifies password. 

```java

```

### Xpath
* Generic Syntax: `//tagname[@attribute="value"]`
* Xpath child item: `//tagname[@attribute="value"](index)`
* path: `//parenttagname/childtagname` -> `//form/h2`
* Regular expression `//tagname[contains(@attribute,"value")]` -> //
* Sibiling to sibiling traverse `//path/to/attribute/following-sibiling::button[1]` -> `//header/div/button[1]/following-sibling::button[1]`

```h

html: 
<tr class="cb-srs-stats-tr" xpath="1"> 
    <td class="cb-srs-stats-td text-left">
        <a class="cb-text-link" href="/profiles/3817/sunil-gavaskar">Sunil Gavaskar</a></td>
    <td class="cb-srs-stats-td">125</td> 
    <td class="cb-srs-stats-td">214</td> 
    <td class="cb-srs-stats-td">10,122</td> 
    <td class="cb-srs-stats-td">51</td> 
    <td class="cb-srs-stats-td">66</td> 
    <td class="cb-srs-stats-td">1,016</td>
    <td class="cb-srs-stats-td">26</td> 
</tr>


# Xpath for Sunil gavaskar innings: 
//a[@href="/profiles/3817/sunil-gavaskar"]/../../td[3]

1. Find the xpath of player
2. Traverse back to parent element
3. select td[column] for correct column.
```

## Drop Downs

* Dropdowns with `select` tag are static dropdowns



