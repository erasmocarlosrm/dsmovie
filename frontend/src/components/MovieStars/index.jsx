import {ReactComponent as StarFull } from 'assets/img/StarFull.svg';
import {ReactComponent as StarHalf } from 'assets/img/StarHalf.svg'
import {ReactComponent as StarEmpyt } from 'assets/img/StarEmpyt.svg'

function MovieStart() {
  return (
    <div className="dsmovie-stars-container">
      <StarFull />
      <StarFull />
      <StarFull />
      <StarHalf />
      <StarEmpyt />
    </div>
  );
}

export default MovieStart;
