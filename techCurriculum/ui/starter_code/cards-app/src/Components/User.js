/**
 * Create the user icon to render an image
 * @author Ashka Stephen
 */

import React from 'react';

function User(){
	return (  
			//classname rather than class
			<div className = 'user'>
				<i className = 'fa fa-user-o'/>
				<p> Words </p>
			</div>
	);
}
export default User;