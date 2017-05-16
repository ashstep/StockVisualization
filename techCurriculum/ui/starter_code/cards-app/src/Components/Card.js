/**
 * Card 
 * @author Ashka Stephen
 */

import React from 'react';
import User from './User';
import Message from './Message';

function Card() {
  return (
    <div className='card'>
      <User />
      <div className='card-main'>
        <Message />
      </div>
    </div>
  );
}
export default Card;